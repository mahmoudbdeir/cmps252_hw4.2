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

@Tag("33")
class Record_3767 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3767: FirstName is Dominique")
	void FirstNameOfRecord3767() {
		assertEquals("Dominique", customers.get(3766).getFirstName());
	}

	@Test
	@DisplayName("Record 3767: LastName is Barsotti")
	void LastNameOfRecord3767() {
		assertEquals("Barsotti", customers.get(3766).getLastName());
	}

	@Test
	@DisplayName("Record 3767: Company is J W Reffel Metals Foundry Inc")
	void CompanyOfRecord3767() {
		assertEquals("J W Reffel Metals Foundry Inc", customers.get(3766).getCompany());
	}

	@Test
	@DisplayName("Record 3767: Address is 721 Revolution St")
	void AddressOfRecord3767() {
		assertEquals("721 Revolution St", customers.get(3766).getAddress());
	}

	@Test
	@DisplayName("Record 3767: City is Havre de Grace")
	void CityOfRecord3767() {
		assertEquals("Havre de Grace", customers.get(3766).getCity());
	}

	@Test
	@DisplayName("Record 3767: County is Harford")
	void CountyOfRecord3767() {
		assertEquals("Harford", customers.get(3766).getCounty());
	}

	@Test
	@DisplayName("Record 3767: State is MD")
	void StateOfRecord3767() {
		assertEquals("MD", customers.get(3766).getState());
	}

	@Test
	@DisplayName("Record 3767: ZIP is 21078")
	void ZIPOfRecord3767() {
		assertEquals("21078", customers.get(3766).getZIP());
	}

	@Test
	@DisplayName("Record 3767: Phone is 410-939-7463")
	void PhoneOfRecord3767() {
		assertEquals("410-939-7463", customers.get(3766).getPhone());
	}

	@Test
	@DisplayName("Record 3767: Fax is 410-939-4995")
	void FaxOfRecord3767() {
		assertEquals("410-939-4995", customers.get(3766).getFax());
	}

	@Test
	@DisplayName("Record 3767: Email is dominique@barsotti.com")
	void EmailOfRecord3767() {
		assertEquals("dominique@barsotti.com", customers.get(3766).getEmail());
	}

	@Test
	@DisplayName("Record 3767: Web is http://www.dominiquebarsotti.com")
	void WebOfRecord3767() {
		assertEquals("http://www.dominiquebarsotti.com", customers.get(3766).getWeb());
	}
}
