package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("19")
class Record_1864 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1864: FirstName is Dale")
	void FirstNameOfRecord1864() {
		assertEquals("Dale", customers.get(1863).getFirstName());
	}

	@Test
	@DisplayName("Record 1864: LastName is Groshans")
	void LastNameOfRecord1864() {
		assertEquals("Groshans", customers.get(1863).getLastName());
	}

	@Test
	@DisplayName("Record 1864: Company is Webster Sheet Metal Inc")
	void CompanyOfRecord1864() {
		assertEquals("Webster Sheet Metal Inc", customers.get(1863).getCompany());
	}

	@Test
	@DisplayName("Record 1864: Address is 145 Chapel St")
	void AddressOfRecord1864() {
		assertEquals("145 Chapel St", customers.get(1863).getAddress());
	}

	@Test
	@DisplayName("Record 1864: City is Newark")
	void CityOfRecord1864() {
		assertEquals("Newark", customers.get(1863).getCity());
	}

	@Test
	@DisplayName("Record 1864: County is Essex")
	void CountyOfRecord1864() {
		assertEquals("Essex", customers.get(1863).getCounty());
	}

	@Test
	@DisplayName("Record 1864: State is NJ")
	void StateOfRecord1864() {
		assertEquals("NJ", customers.get(1863).getState());
	}

	@Test
	@DisplayName("Record 1864: ZIP is 7105")
	void ZIPOfRecord1864() {
		assertEquals("7105", customers.get(1863).getZIP());
	}

	@Test
	@DisplayName("Record 1864: Phone is 973-589-8198")
	void PhoneOfRecord1864() {
		assertEquals("973-589-8198", customers.get(1863).getPhone());
	}

	@Test
	@DisplayName("Record 1864: Fax is 973-589-6498")
	void FaxOfRecord1864() {
		assertEquals("973-589-6498", customers.get(1863).getFax());
	}

	@Test
	@DisplayName("Record 1864: Email is dale@groshans.com")
	void EmailOfRecord1864() {
		assertEquals("dale@groshans.com", customers.get(1863).getEmail());
	}

	@Test
	@DisplayName("Record 1864: Web is http://www.dalegroshans.com")
	void WebOfRecord1864() {
		assertEquals("http://www.dalegroshans.com", customers.get(1863).getWeb());
	}
}
