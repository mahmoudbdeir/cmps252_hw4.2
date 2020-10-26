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
class Record_2830 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2830: FirstName is Louie")
	void FirstNameOfRecord2830() {
		assertEquals("Louie", customers.get(2829).getFirstName());
	}

	@Test
	@DisplayName("Record 2830: LastName is Derringer")
	void LastNameOfRecord2830() {
		assertEquals("Derringer", customers.get(2829).getLastName());
	}

	@Test
	@DisplayName("Record 2830: Company is Spindler Brothers Co")
	void CompanyOfRecord2830() {
		assertEquals("Spindler Brothers Co", customers.get(2829).getCompany());
	}

	@Test
	@DisplayName("Record 2830: Address is 2540 S Academy Blvd")
	void AddressOfRecord2830() {
		assertEquals("2540 S Academy Blvd", customers.get(2829).getAddress());
	}

	@Test
	@DisplayName("Record 2830: City is Colorado Springs")
	void CityOfRecord2830() {
		assertEquals("Colorado Springs", customers.get(2829).getCity());
	}

	@Test
	@DisplayName("Record 2830: County is El Paso")
	void CountyOfRecord2830() {
		assertEquals("El Paso", customers.get(2829).getCounty());
	}

	@Test
	@DisplayName("Record 2830: State is CO")
	void StateOfRecord2830() {
		assertEquals("CO", customers.get(2829).getState());
	}

	@Test
	@DisplayName("Record 2830: ZIP is 80916")
	void ZIPOfRecord2830() {
		assertEquals("80916", customers.get(2829).getZIP());
	}

	@Test
	@DisplayName("Record 2830: Phone is 719-391-5923")
	void PhoneOfRecord2830() {
		assertEquals("719-391-5923", customers.get(2829).getPhone());
	}

	@Test
	@DisplayName("Record 2830: Fax is 719-391-8939")
	void FaxOfRecord2830() {
		assertEquals("719-391-8939", customers.get(2829).getFax());
	}

	@Test
	@DisplayName("Record 2830: Email is louie@derringer.com")
	void EmailOfRecord2830() {
		assertEquals("louie@derringer.com", customers.get(2829).getEmail());
	}

	@Test
	@DisplayName("Record 2830: Web is http://www.louiederringer.com")
	void WebOfRecord2830() {
		assertEquals("http://www.louiederringer.com", customers.get(2829).getWeb());
	}
}
