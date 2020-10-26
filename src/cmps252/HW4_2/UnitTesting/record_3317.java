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

@Tag("34")
class Record_3317 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3317: FirstName is Rick")
	void FirstNameOfRecord3317() {
		assertEquals("Rick", customers.get(3316).getFirstName());
	}

	@Test
	@DisplayName("Record 3317: LastName is Brandal")
	void LastNameOfRecord3317() {
		assertEquals("Brandal", customers.get(3316).getLastName());
	}

	@Test
	@DisplayName("Record 3317: Company is Tru Cut Mowers & Edgers")
	void CompanyOfRecord3317() {
		assertEquals("Tru Cut Mowers & Edgers", customers.get(3316).getCompany());
	}

	@Test
	@DisplayName("Record 3317: Address is 120 N 8th St")
	void AddressOfRecord3317() {
		assertEquals("120 N 8th St", customers.get(3316).getAddress());
	}

	@Test
	@DisplayName("Record 3317: City is Vineland")
	void CityOfRecord3317() {
		assertEquals("Vineland", customers.get(3316).getCity());
	}

	@Test
	@DisplayName("Record 3317: County is Cumberland")
	void CountyOfRecord3317() {
		assertEquals("Cumberland", customers.get(3316).getCounty());
	}

	@Test
	@DisplayName("Record 3317: State is NJ")
	void StateOfRecord3317() {
		assertEquals("NJ", customers.get(3316).getState());
	}

	@Test
	@DisplayName("Record 3317: ZIP is 8360")
	void ZIPOfRecord3317() {
		assertEquals("8360", customers.get(3316).getZIP());
	}

	@Test
	@DisplayName("Record 3317: Phone is 856-696-4019")
	void PhoneOfRecord3317() {
		assertEquals("856-696-4019", customers.get(3316).getPhone());
	}

	@Test
	@DisplayName("Record 3317: Fax is 856-696-3139")
	void FaxOfRecord3317() {
		assertEquals("856-696-3139", customers.get(3316).getFax());
	}

	@Test
	@DisplayName("Record 3317: Email is rick@brandal.com")
	void EmailOfRecord3317() {
		assertEquals("rick@brandal.com", customers.get(3316).getEmail());
	}

	@Test
	@DisplayName("Record 3317: Web is http://www.rickbrandal.com")
	void WebOfRecord3317() {
		assertEquals("http://www.rickbrandal.com", customers.get(3316).getWeb());
	}
}
