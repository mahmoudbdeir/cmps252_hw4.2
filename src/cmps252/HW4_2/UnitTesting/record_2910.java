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

@Tag("20")
class Record_2910 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2910: FirstName is Janette")
	void FirstNameOfRecord2910() {
		assertEquals("Janette", customers.get(2909).getFirstName());
	}

	@Test
	@DisplayName("Record 2910: LastName is Nydich")
	void LastNameOfRecord2910() {
		assertEquals("Nydich", customers.get(2909).getLastName());
	}

	@Test
	@DisplayName("Record 2910: Company is Elliot Barry Company")
	void CompanyOfRecord2910() {
		assertEquals("Elliot Barry Company", customers.get(2909).getCompany());
	}

	@Test
	@DisplayName("Record 2910: Address is 222 N Seltser St")
	void AddressOfRecord2910() {
		assertEquals("222 N Seltser St", customers.get(2909).getAddress());
	}

	@Test
	@DisplayName("Record 2910: City is Crestline")
	void CityOfRecord2910() {
		assertEquals("Crestline", customers.get(2909).getCity());
	}

	@Test
	@DisplayName("Record 2910: County is Crawford")
	void CountyOfRecord2910() {
		assertEquals("Crawford", customers.get(2909).getCounty());
	}

	@Test
	@DisplayName("Record 2910: State is OH")
	void StateOfRecord2910() {
		assertEquals("OH", customers.get(2909).getState());
	}

	@Test
	@DisplayName("Record 2910: ZIP is 44827")
	void ZIPOfRecord2910() {
		assertEquals("44827", customers.get(2909).getZIP());
	}

	@Test
	@DisplayName("Record 2910: Phone is 419-683-6361")
	void PhoneOfRecord2910() {
		assertEquals("419-683-6361", customers.get(2909).getPhone());
	}

	@Test
	@DisplayName("Record 2910: Fax is 419-683-6634")
	void FaxOfRecord2910() {
		assertEquals("419-683-6634", customers.get(2909).getFax());
	}

	@Test
	@DisplayName("Record 2910: Email is janette@nydich.com")
	void EmailOfRecord2910() {
		assertEquals("janette@nydich.com", customers.get(2909).getEmail());
	}

	@Test
	@DisplayName("Record 2910: Web is http://www.janettenydich.com")
	void WebOfRecord2910() {
		assertEquals("http://www.janettenydich.com", customers.get(2909).getWeb());
	}
}
