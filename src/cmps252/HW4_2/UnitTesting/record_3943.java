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
class Record_3943 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3943: FirstName is Federico")
	void FirstNameOfRecord3943() {
		assertEquals("Federico", customers.get(3942).getFirstName());
	}

	@Test
	@DisplayName("Record 3943: LastName is Delucca")
	void LastNameOfRecord3943() {
		assertEquals("Delucca", customers.get(3942).getLastName());
	}

	@Test
	@DisplayName("Record 3943: Company is Peerless Heater Co")
	void CompanyOfRecord3943() {
		assertEquals("Peerless Heater Co", customers.get(3942).getCompany());
	}

	@Test
	@DisplayName("Record 3943: Address is 54 State St")
	void AddressOfRecord3943() {
		assertEquals("54 State St", customers.get(3942).getAddress());
	}

	@Test
	@DisplayName("Record 3943: City is North Haven")
	void CityOfRecord3943() {
		assertEquals("North Haven", customers.get(3942).getCity());
	}

	@Test
	@DisplayName("Record 3943: County is New Haven")
	void CountyOfRecord3943() {
		assertEquals("New Haven", customers.get(3942).getCounty());
	}

	@Test
	@DisplayName("Record 3943: State is CT")
	void StateOfRecord3943() {
		assertEquals("CT", customers.get(3942).getState());
	}

	@Test
	@DisplayName("Record 3943: ZIP is 6473")
	void ZIPOfRecord3943() {
		assertEquals("6473", customers.get(3942).getZIP());
	}

	@Test
	@DisplayName("Record 3943: Phone is 203-234-0710")
	void PhoneOfRecord3943() {
		assertEquals("203-234-0710", customers.get(3942).getPhone());
	}

	@Test
	@DisplayName("Record 3943: Fax is 203-234-8598")
	void FaxOfRecord3943() {
		assertEquals("203-234-8598", customers.get(3942).getFax());
	}

	@Test
	@DisplayName("Record 3943: Email is federico@delucca.com")
	void EmailOfRecord3943() {
		assertEquals("federico@delucca.com", customers.get(3942).getEmail());
	}

	@Test
	@DisplayName("Record 3943: Web is http://www.federicodelucca.com")
	void WebOfRecord3943() {
		assertEquals("http://www.federicodelucca.com", customers.get(3942).getWeb());
	}
}
