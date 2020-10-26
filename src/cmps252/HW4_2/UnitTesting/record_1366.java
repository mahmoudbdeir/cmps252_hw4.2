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

@Tag("0")
class Record_1366 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1366: FirstName is Marta")
	void FirstNameOfRecord1366() {
		assertEquals("Marta", customers.get(1365).getFirstName());
	}

	@Test
	@DisplayName("Record 1366: LastName is Halle")
	void LastNameOfRecord1366() {
		assertEquals("Halle", customers.get(1365).getLastName());
	}

	@Test
	@DisplayName("Record 1366: Company is Dill, James M Esq")
	void CompanyOfRecord1366() {
		assertEquals("Dill, James M Esq", customers.get(1365).getCompany());
	}

	@Test
	@DisplayName("Record 1366: Address is 21 N 10th Ave")
	void AddressOfRecord1366() {
		assertEquals("21 N 10th Ave", customers.get(1365).getAddress());
	}

	@Test
	@DisplayName("Record 1366: City is Coatesville")
	void CityOfRecord1366() {
		assertEquals("Coatesville", customers.get(1365).getCity());
	}

	@Test
	@DisplayName("Record 1366: County is Chester")
	void CountyOfRecord1366() {
		assertEquals("Chester", customers.get(1365).getCounty());
	}

	@Test
	@DisplayName("Record 1366: State is PA")
	void StateOfRecord1366() {
		assertEquals("PA", customers.get(1365).getState());
	}

	@Test
	@DisplayName("Record 1366: ZIP is 19320")
	void ZIPOfRecord1366() {
		assertEquals("19320", customers.get(1365).getZIP());
	}

	@Test
	@DisplayName("Record 1366: Phone is 610-383-7000")
	void PhoneOfRecord1366() {
		assertEquals("610-383-7000", customers.get(1365).getPhone());
	}

	@Test
	@DisplayName("Record 1366: Fax is 610-383-7588")
	void FaxOfRecord1366() {
		assertEquals("610-383-7588", customers.get(1365).getFax());
	}

	@Test
	@DisplayName("Record 1366: Email is marta@halle.com")
	void EmailOfRecord1366() {
		assertEquals("marta@halle.com", customers.get(1365).getEmail());
	}

	@Test
	@DisplayName("Record 1366: Web is http://www.martahalle.com")
	void WebOfRecord1366() {
		assertEquals("http://www.martahalle.com", customers.get(1365).getWeb());
	}
}
