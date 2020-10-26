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

@Tag("11")
class Record_927 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 927: FirstName is Chuck")
	void FirstNameOfRecord927() {
		assertEquals("Chuck", customers.get(926).getFirstName());
	}

	@Test
	@DisplayName("Record 927: LastName is Mcpartland")
	void LastNameOfRecord927() {
		assertEquals("Mcpartland", customers.get(926).getLastName());
	}

	@Test
	@DisplayName("Record 927: Company is Deconcini Mcdonald Brammer")
	void CompanyOfRecord927() {
		assertEquals("Deconcini Mcdonald Brammer", customers.get(926).getCompany());
	}

	@Test
	@DisplayName("Record 927: Address is 601 E Charleston Blvd")
	void AddressOfRecord927() {
		assertEquals("601 E Charleston Blvd", customers.get(926).getAddress());
	}

	@Test
	@DisplayName("Record 927: City is Las Vegas")
	void CityOfRecord927() {
		assertEquals("Las Vegas", customers.get(926).getCity());
	}

	@Test
	@DisplayName("Record 927: County is Clark")
	void CountyOfRecord927() {
		assertEquals("Clark", customers.get(926).getCounty());
	}

	@Test
	@DisplayName("Record 927: State is NV")
	void StateOfRecord927() {
		assertEquals("NV", customers.get(926).getState());
	}

	@Test
	@DisplayName("Record 927: ZIP is 89104")
	void ZIPOfRecord927() {
		assertEquals("89104", customers.get(926).getZIP());
	}

	@Test
	@DisplayName("Record 927: Phone is 702-383-9989")
	void PhoneOfRecord927() {
		assertEquals("702-383-9989", customers.get(926).getPhone());
	}

	@Test
	@DisplayName("Record 927: Fax is 702-383-2264")
	void FaxOfRecord927() {
		assertEquals("702-383-2264", customers.get(926).getFax());
	}

	@Test
	@DisplayName("Record 927: Email is chuck@mcpartland.com")
	void EmailOfRecord927() {
		assertEquals("chuck@mcpartland.com", customers.get(926).getEmail());
	}

	@Test
	@DisplayName("Record 927: Web is http://www.chuckmcpartland.com")
	void WebOfRecord927() {
		assertEquals("http://www.chuckmcpartland.com", customers.get(926).getWeb());
	}
}
