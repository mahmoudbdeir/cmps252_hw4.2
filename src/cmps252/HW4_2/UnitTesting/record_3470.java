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

@Tag("40")
class Record_3470 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3470: FirstName is Nichole")
	void FirstNameOfRecord3470() {
		assertEquals("Nichole", customers.get(3469).getFirstName());
	}

	@Test
	@DisplayName("Record 3470: LastName is Duquette")
	void LastNameOfRecord3470() {
		assertEquals("Duquette", customers.get(3469).getLastName());
	}

	@Test
	@DisplayName("Record 3470: Company is Grabavoy, Denise Esq")
	void CompanyOfRecord3470() {
		assertEquals("Grabavoy, Denise Esq", customers.get(3469).getCompany());
	}

	@Test
	@DisplayName("Record 3470: Address is 953 Ne Osceola Ave")
	void AddressOfRecord3470() {
		assertEquals("953 Ne Osceola Ave", customers.get(3469).getAddress());
	}

	@Test
	@DisplayName("Record 3470: City is Ocala")
	void CityOfRecord3470() {
		assertEquals("Ocala", customers.get(3469).getCity());
	}

	@Test
	@DisplayName("Record 3470: County is Marion")
	void CountyOfRecord3470() {
		assertEquals("Marion", customers.get(3469).getCounty());
	}

	@Test
	@DisplayName("Record 3470: State is FL")
	void StateOfRecord3470() {
		assertEquals("FL", customers.get(3469).getState());
	}

	@Test
	@DisplayName("Record 3470: ZIP is 34470")
	void ZIPOfRecord3470() {
		assertEquals("34470", customers.get(3469).getZIP());
	}

	@Test
	@DisplayName("Record 3470: Phone is 352-368-7713")
	void PhoneOfRecord3470() {
		assertEquals("352-368-7713", customers.get(3469).getPhone());
	}

	@Test
	@DisplayName("Record 3470: Fax is 352-368-0813")
	void FaxOfRecord3470() {
		assertEquals("352-368-0813", customers.get(3469).getFax());
	}

	@Test
	@DisplayName("Record 3470: Email is nichole@duquette.com")
	void EmailOfRecord3470() {
		assertEquals("nichole@duquette.com", customers.get(3469).getEmail());
	}

	@Test
	@DisplayName("Record 3470: Web is http://www.nicholeduquette.com")
	void WebOfRecord3470() {
		assertEquals("http://www.nicholeduquette.com", customers.get(3469).getWeb());
	}
}
