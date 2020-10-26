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
class Record_1253 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1253: FirstName is Andreas")
	void FirstNameOfRecord1253() {
		assertEquals("Andreas", customers.get(1252).getFirstName());
	}

	@Test
	@DisplayName("Record 1253: LastName is Rase")
	void LastNameOfRecord1253() {
		assertEquals("Rase", customers.get(1252).getLastName());
	}

	@Test
	@DisplayName("Record 1253: Company is Production Specialties")
	void CompanyOfRecord1253() {
		assertEquals("Production Specialties", customers.get(1252).getCompany());
	}

	@Test
	@DisplayName("Record 1253: Address is 418 S Main St")
	void AddressOfRecord1253() {
		assertEquals("418 S Main St", customers.get(1252).getAddress());
	}

	@Test
	@DisplayName("Record 1253: City is Bel Air")
	void CityOfRecord1253() {
		assertEquals("Bel Air", customers.get(1252).getCity());
	}

	@Test
	@DisplayName("Record 1253: County is Harford")
	void CountyOfRecord1253() {
		assertEquals("Harford", customers.get(1252).getCounty());
	}

	@Test
	@DisplayName("Record 1253: State is MD")
	void StateOfRecord1253() {
		assertEquals("MD", customers.get(1252).getState());
	}

	@Test
	@DisplayName("Record 1253: ZIP is 21014")
	void ZIPOfRecord1253() {
		assertEquals("21014", customers.get(1252).getZIP());
	}

	@Test
	@DisplayName("Record 1253: Phone is 410-531-7572")
	void PhoneOfRecord1253() {
		assertEquals("410-531-7572", customers.get(1252).getPhone());
	}

	@Test
	@DisplayName("Record 1253: Fax is 410-531-4872")
	void FaxOfRecord1253() {
		assertEquals("410-531-4872", customers.get(1252).getFax());
	}

	@Test
	@DisplayName("Record 1253: Email is andreas@rase.com")
	void EmailOfRecord1253() {
		assertEquals("andreas@rase.com", customers.get(1252).getEmail());
	}

	@Test
	@DisplayName("Record 1253: Web is http://www.andreasrase.com")
	void WebOfRecord1253() {
		assertEquals("http://www.andreasrase.com", customers.get(1252).getWeb());
	}
}
