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

@Tag("12")
class Record_1963 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1963: FirstName is Christy")
	void FirstNameOfRecord1963() {
		assertEquals("Christy", customers.get(1962).getFirstName());
	}

	@Test
	@DisplayName("Record 1963: LastName is Brassfield")
	void LastNameOfRecord1963() {
		assertEquals("Brassfield", customers.get(1962).getLastName());
	}

	@Test
	@DisplayName("Record 1963: Company is Jeans Foods Inc")
	void CompanyOfRecord1963() {
		assertEquals("Jeans Foods Inc", customers.get(1962).getCompany());
	}

	@Test
	@DisplayName("Record 1963: Address is 2 Mott St")
	void AddressOfRecord1963() {
		assertEquals("2 Mott St", customers.get(1962).getAddress());
	}

	@Test
	@DisplayName("Record 1963: City is Newark")
	void CityOfRecord1963() {
		assertEquals("Newark", customers.get(1962).getCity());
	}

	@Test
	@DisplayName("Record 1963: County is Essex")
	void CountyOfRecord1963() {
		assertEquals("Essex", customers.get(1962).getCounty());
	}

	@Test
	@DisplayName("Record 1963: State is NJ")
	void StateOfRecord1963() {
		assertEquals("NJ", customers.get(1962).getState());
	}

	@Test
	@DisplayName("Record 1963: ZIP is 7105")
	void ZIPOfRecord1963() {
		assertEquals("7105", customers.get(1962).getZIP());
	}

	@Test
	@DisplayName("Record 1963: Phone is 973-851-6910")
	void PhoneOfRecord1963() {
		assertEquals("973-851-6910", customers.get(1962).getPhone());
	}

	@Test
	@DisplayName("Record 1963: Fax is 973-851-0619")
	void FaxOfRecord1963() {
		assertEquals("973-851-0619", customers.get(1962).getFax());
	}

	@Test
	@DisplayName("Record 1963: Email is christy@brassfield.com")
	void EmailOfRecord1963() {
		assertEquals("christy@brassfield.com", customers.get(1962).getEmail());
	}

	@Test
	@DisplayName("Record 1963: Web is http://www.christybrassfield.com")
	void WebOfRecord1963() {
		assertEquals("http://www.christybrassfield.com", customers.get(1962).getWeb());
	}
}
