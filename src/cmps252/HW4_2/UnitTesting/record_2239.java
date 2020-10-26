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

@Tag("34")
class Record_2239 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2239: FirstName is Enoch")
	void FirstNameOfRecord2239() {
		assertEquals("Enoch", customers.get(2238).getFirstName());
	}

	@Test
	@DisplayName("Record 2239: LastName is Sirianni")
	void LastNameOfRecord2239() {
		assertEquals("Sirianni", customers.get(2238).getLastName());
	}

	@Test
	@DisplayName("Record 2239: Company is A M King Industries Inc")
	void CompanyOfRecord2239() {
		assertEquals("A M King Industries Inc", customers.get(2238).getCompany());
	}

	@Test
	@DisplayName("Record 2239: Address is 1111 Rancho Conejo Blvd  #-10")
	void AddressOfRecord2239() {
		assertEquals("1111 Rancho Conejo Blvd  #-10", customers.get(2238).getAddress());
	}

	@Test
	@DisplayName("Record 2239: City is Newbury Park")
	void CityOfRecord2239() {
		assertEquals("Newbury Park", customers.get(2238).getCity());
	}

	@Test
	@DisplayName("Record 2239: County is Ventura")
	void CountyOfRecord2239() {
		assertEquals("Ventura", customers.get(2238).getCounty());
	}

	@Test
	@DisplayName("Record 2239: State is CA")
	void StateOfRecord2239() {
		assertEquals("CA", customers.get(2238).getState());
	}

	@Test
	@DisplayName("Record 2239: ZIP is 91320")
	void ZIPOfRecord2239() {
		assertEquals("91320", customers.get(2238).getZIP());
	}

	@Test
	@DisplayName("Record 2239: Phone is 805-499-3694")
	void PhoneOfRecord2239() {
		assertEquals("805-499-3694", customers.get(2238).getPhone());
	}

	@Test
	@DisplayName("Record 2239: Fax is 805-499-2763")
	void FaxOfRecord2239() {
		assertEquals("805-499-2763", customers.get(2238).getFax());
	}

	@Test
	@DisplayName("Record 2239: Email is enoch@sirianni.com")
	void EmailOfRecord2239() {
		assertEquals("enoch@sirianni.com", customers.get(2238).getEmail());
	}

	@Test
	@DisplayName("Record 2239: Web is http://www.enochsirianni.com")
	void WebOfRecord2239() {
		assertEquals("http://www.enochsirianni.com", customers.get(2238).getWeb());
	}
}
