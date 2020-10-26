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

@Tag("47")
class Record_3514 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3514: FirstName is Gaylord")
	void FirstNameOfRecord3514() {
		assertEquals("Gaylord", customers.get(3513).getFirstName());
	}

	@Test
	@DisplayName("Record 3514: LastName is Szuba")
	void LastNameOfRecord3514() {
		assertEquals("Szuba", customers.get(3513).getLastName());
	}

	@Test
	@DisplayName("Record 3514: Company is Dantel Inc")
	void CompanyOfRecord3514() {
		assertEquals("Dantel Inc", customers.get(3513).getCompany());
	}

	@Test
	@DisplayName("Record 3514: Address is 400 Kaiser Dr")
	void AddressOfRecord3514() {
		assertEquals("400 Kaiser Dr", customers.get(3513).getAddress());
	}

	@Test
	@DisplayName("Record 3514: City is Folcroft")
	void CityOfRecord3514() {
		assertEquals("Folcroft", customers.get(3513).getCity());
	}

	@Test
	@DisplayName("Record 3514: County is Delaware")
	void CountyOfRecord3514() {
		assertEquals("Delaware", customers.get(3513).getCounty());
	}

	@Test
	@DisplayName("Record 3514: State is PA")
	void StateOfRecord3514() {
		assertEquals("PA", customers.get(3513).getState());
	}

	@Test
	@DisplayName("Record 3514: ZIP is 19032")
	void ZIPOfRecord3514() {
		assertEquals("19032", customers.get(3513).getZIP());
	}

	@Test
	@DisplayName("Record 3514: Phone is 610-876-3922")
	void PhoneOfRecord3514() {
		assertEquals("610-876-3922", customers.get(3513).getPhone());
	}

	@Test
	@DisplayName("Record 3514: Fax is 610-876-3705")
	void FaxOfRecord3514() {
		assertEquals("610-876-3705", customers.get(3513).getFax());
	}

	@Test
	@DisplayName("Record 3514: Email is gaylord@szuba.com")
	void EmailOfRecord3514() {
		assertEquals("gaylord@szuba.com", customers.get(3513).getEmail());
	}

	@Test
	@DisplayName("Record 3514: Web is http://www.gaylordszuba.com")
	void WebOfRecord3514() {
		assertEquals("http://www.gaylordszuba.com", customers.get(3513).getWeb());
	}
}
