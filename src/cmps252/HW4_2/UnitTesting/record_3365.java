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

@Tag("44")
class Record_3365 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3365: FirstName is Ernesto")
	void FirstNameOfRecord3365() {
		assertEquals("Ernesto", customers.get(3364).getFirstName());
	}

	@Test
	@DisplayName("Record 3365: LastName is Hooke")
	void LastNameOfRecord3365() {
		assertEquals("Hooke", customers.get(3364).getLastName());
	}

	@Test
	@DisplayName("Record 3365: Company is David Mogen Wine Corp")
	void CompanyOfRecord3365() {
		assertEquals("David Mogen Wine Corp", customers.get(3364).getCompany());
	}

	@Test
	@DisplayName("Record 3365: Address is 79 W Monroe St")
	void AddressOfRecord3365() {
		assertEquals("79 W Monroe St", customers.get(3364).getAddress());
	}

	@Test
	@DisplayName("Record 3365: City is Chicago")
	void CityOfRecord3365() {
		assertEquals("Chicago", customers.get(3364).getCity());
	}

	@Test
	@DisplayName("Record 3365: County is Cook")
	void CountyOfRecord3365() {
		assertEquals("Cook", customers.get(3364).getCounty());
	}

	@Test
	@DisplayName("Record 3365: State is IL")
	void StateOfRecord3365() {
		assertEquals("IL", customers.get(3364).getState());
	}

	@Test
	@DisplayName("Record 3365: ZIP is 60603")
	void ZIPOfRecord3365() {
		assertEquals("60603", customers.get(3364).getZIP());
	}

	@Test
	@DisplayName("Record 3365: Phone is 312-236-1567")
	void PhoneOfRecord3365() {
		assertEquals("312-236-1567", customers.get(3364).getPhone());
	}

	@Test
	@DisplayName("Record 3365: Fax is 312-236-4647")
	void FaxOfRecord3365() {
		assertEquals("312-236-4647", customers.get(3364).getFax());
	}

	@Test
	@DisplayName("Record 3365: Email is ernesto@hooke.com")
	void EmailOfRecord3365() {
		assertEquals("ernesto@hooke.com", customers.get(3364).getEmail());
	}

	@Test
	@DisplayName("Record 3365: Web is http://www.ernestohooke.com")
	void WebOfRecord3365() {
		assertEquals("http://www.ernestohooke.com", customers.get(3364).getWeb());
	}
}
