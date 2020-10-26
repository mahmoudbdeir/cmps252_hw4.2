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

@Tag("42")
class Record_3141 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3141: FirstName is Roger")
	void FirstNameOfRecord3141() {
		assertEquals("Roger", customers.get(3140).getFirstName());
	}

	@Test
	@DisplayName("Record 3141: LastName is Carsen")
	void LastNameOfRecord3141() {
		assertEquals("Carsen", customers.get(3140).getLastName());
	}

	@Test
	@DisplayName("Record 3141: Company is Roth Young Personnel Svce N Y")
	void CompanyOfRecord3141() {
		assertEquals("Roth Young Personnel Svce N Y", customers.get(3140).getCompany());
	}

	@Test
	@DisplayName("Record 3141: Address is 115 E High St")
	void AddressOfRecord3141() {
		assertEquals("115 E High St", customers.get(3140).getAddress());
	}

	@Test
	@DisplayName("Record 3141: City is Piqua")
	void CityOfRecord3141() {
		assertEquals("Piqua", customers.get(3140).getCity());
	}

	@Test
	@DisplayName("Record 3141: County is Miami")
	void CountyOfRecord3141() {
		assertEquals("Miami", customers.get(3140).getCounty());
	}

	@Test
	@DisplayName("Record 3141: State is OH")
	void StateOfRecord3141() {
		assertEquals("OH", customers.get(3140).getState());
	}

	@Test
	@DisplayName("Record 3141: ZIP is 45356")
	void ZIPOfRecord3141() {
		assertEquals("45356", customers.get(3140).getZIP());
	}

	@Test
	@DisplayName("Record 3141: Phone is 937-773-7752")
	void PhoneOfRecord3141() {
		assertEquals("937-773-7752", customers.get(3140).getPhone());
	}

	@Test
	@DisplayName("Record 3141: Fax is 937-773-8715")
	void FaxOfRecord3141() {
		assertEquals("937-773-8715", customers.get(3140).getFax());
	}

	@Test
	@DisplayName("Record 3141: Email is roger@carsen.com")
	void EmailOfRecord3141() {
		assertEquals("roger@carsen.com", customers.get(3140).getEmail());
	}

	@Test
	@DisplayName("Record 3141: Web is http://www.rogercarsen.com")
	void WebOfRecord3141() {
		assertEquals("http://www.rogercarsen.com", customers.get(3140).getWeb());
	}
}
