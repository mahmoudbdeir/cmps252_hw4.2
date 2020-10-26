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
class Record_1110 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1110: FirstName is Valerie")
	void FirstNameOfRecord1110() {
		assertEquals("Valerie", customers.get(1109).getFirstName());
	}

	@Test
	@DisplayName("Record 1110: LastName is Bulle")
	void LastNameOfRecord1110() {
		assertEquals("Bulle", customers.get(1109).getLastName());
	}

	@Test
	@DisplayName("Record 1110: Company is Kemmer, A Melvin Esq")
	void CompanyOfRecord1110() {
		assertEquals("Kemmer, A Melvin Esq", customers.get(1109).getCompany());
	}

	@Test
	@DisplayName("Record 1110: Address is 741 Edgar Rd")
	void AddressOfRecord1110() {
		assertEquals("741 Edgar Rd", customers.get(1109).getAddress());
	}

	@Test
	@DisplayName("Record 1110: City is Elizabeth")
	void CityOfRecord1110() {
		assertEquals("Elizabeth", customers.get(1109).getCity());
	}

	@Test
	@DisplayName("Record 1110: County is Union")
	void CountyOfRecord1110() {
		assertEquals("Union", customers.get(1109).getCounty());
	}

	@Test
	@DisplayName("Record 1110: State is NJ")
	void StateOfRecord1110() {
		assertEquals("NJ", customers.get(1109).getState());
	}

	@Test
	@DisplayName("Record 1110: ZIP is 7202")
	void ZIPOfRecord1110() {
		assertEquals("7202", customers.get(1109).getZIP());
	}

	@Test
	@DisplayName("Record 1110: Phone is 908-353-1524")
	void PhoneOfRecord1110() {
		assertEquals("908-353-1524", customers.get(1109).getPhone());
	}

	@Test
	@DisplayName("Record 1110: Fax is 908-353-5139")
	void FaxOfRecord1110() {
		assertEquals("908-353-5139", customers.get(1109).getFax());
	}

	@Test
	@DisplayName("Record 1110: Email is valerie@bulle.com")
	void EmailOfRecord1110() {
		assertEquals("valerie@bulle.com", customers.get(1109).getEmail());
	}

	@Test
	@DisplayName("Record 1110: Web is http://www.valeriebulle.com")
	void WebOfRecord1110() {
		assertEquals("http://www.valeriebulle.com", customers.get(1109).getWeb());
	}
}
