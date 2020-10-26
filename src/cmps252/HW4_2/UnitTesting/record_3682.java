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

@Tag("29")
class Record_3682 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3682: FirstName is Barton")
	void FirstNameOfRecord3682() {
		assertEquals("Barton", customers.get(3681).getFirstName());
	}

	@Test
	@DisplayName("Record 3682: LastName is Ekstrom")
	void LastNameOfRecord3682() {
		assertEquals("Ekstrom", customers.get(3681).getLastName());
	}

	@Test
	@DisplayName("Record 3682: Company is Tops Tavern On Pike Street")
	void CompanyOfRecord3682() {
		assertEquals("Tops Tavern On Pike Street", customers.get(3681).getCompany());
	}

	@Test
	@DisplayName("Record 3682: Address is 1494 Federal St")
	void AddressOfRecord3682() {
		assertEquals("1494 Federal St", customers.get(3681).getAddress());
	}

	@Test
	@DisplayName("Record 3682: City is Camden")
	void CityOfRecord3682() {
		assertEquals("Camden", customers.get(3681).getCity());
	}

	@Test
	@DisplayName("Record 3682: County is Camden")
	void CountyOfRecord3682() {
		assertEquals("Camden", customers.get(3681).getCounty());
	}

	@Test
	@DisplayName("Record 3682: State is NJ")
	void StateOfRecord3682() {
		assertEquals("NJ", customers.get(3681).getState());
	}

	@Test
	@DisplayName("Record 3682: ZIP is 8105")
	void ZIPOfRecord3682() {
		assertEquals("8105", customers.get(3681).getZIP());
	}

	@Test
	@DisplayName("Record 3682: Phone is 856-966-4745")
	void PhoneOfRecord3682() {
		assertEquals("856-966-4745", customers.get(3681).getPhone());
	}

	@Test
	@DisplayName("Record 3682: Fax is 856-966-4221")
	void FaxOfRecord3682() {
		assertEquals("856-966-4221", customers.get(3681).getFax());
	}

	@Test
	@DisplayName("Record 3682: Email is barton@ekstrom.com")
	void EmailOfRecord3682() {
		assertEquals("barton@ekstrom.com", customers.get(3681).getEmail());
	}

	@Test
	@DisplayName("Record 3682: Web is http://www.bartonekstrom.com")
	void WebOfRecord3682() {
		assertEquals("http://www.bartonekstrom.com", customers.get(3681).getWeb());
	}
}
