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

@Tag("25")
class Record_3864 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3864: FirstName is Jerold")
	void FirstNameOfRecord3864() {
		assertEquals("Jerold", customers.get(3863).getFirstName());
	}

	@Test
	@DisplayName("Record 3864: LastName is Slonaker")
	void LastNameOfRecord3864() {
		assertEquals("Slonaker", customers.get(3863).getLastName());
	}

	@Test
	@DisplayName("Record 3864: Company is Mallinckrodt Veterinary Inc")
	void CompanyOfRecord3864() {
		assertEquals("Mallinckrodt Veterinary Inc", customers.get(3863).getCompany());
	}

	@Test
	@DisplayName("Record 3864: Address is 5102 21st St")
	void AddressOfRecord3864() {
		assertEquals("5102 21st St", customers.get(3863).getAddress());
	}

	@Test
	@DisplayName("Record 3864: City is Long Island City")
	void CityOfRecord3864() {
		assertEquals("Long Island City", customers.get(3863).getCity());
	}

	@Test
	@DisplayName("Record 3864: County is Queens")
	void CountyOfRecord3864() {
		assertEquals("Queens", customers.get(3863).getCounty());
	}

	@Test
	@DisplayName("Record 3864: State is NY")
	void StateOfRecord3864() {
		assertEquals("NY", customers.get(3863).getState());
	}

	@Test
	@DisplayName("Record 3864: ZIP is 11101")
	void ZIPOfRecord3864() {
		assertEquals("11101", customers.get(3863).getZIP());
	}

	@Test
	@DisplayName("Record 3864: Phone is 718-937-2956")
	void PhoneOfRecord3864() {
		assertEquals("718-937-2956", customers.get(3863).getPhone());
	}

	@Test
	@DisplayName("Record 3864: Fax is 718-937-5922")
	void FaxOfRecord3864() {
		assertEquals("718-937-5922", customers.get(3863).getFax());
	}

	@Test
	@DisplayName("Record 3864: Email is jerold@slonaker.com")
	void EmailOfRecord3864() {
		assertEquals("jerold@slonaker.com", customers.get(3863).getEmail());
	}

	@Test
	@DisplayName("Record 3864: Web is http://www.jeroldslonaker.com")
	void WebOfRecord3864() {
		assertEquals("http://www.jeroldslonaker.com", customers.get(3863).getWeb());
	}
}
