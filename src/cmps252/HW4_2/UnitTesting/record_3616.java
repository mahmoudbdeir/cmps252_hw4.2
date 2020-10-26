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

@Tag("20")
class Record_3616 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3616: FirstName is Toby")
	void FirstNameOfRecord3616() {
		assertEquals("Toby", customers.get(3615).getFirstName());
	}

	@Test
	@DisplayName("Record 3616: LastName is Gollop")
	void LastNameOfRecord3616() {
		assertEquals("Gollop", customers.get(3615).getLastName());
	}

	@Test
	@DisplayName("Record 3616: Company is Quality Printing Co")
	void CompanyOfRecord3616() {
		assertEquals("Quality Printing Co", customers.get(3615).getCompany());
	}

	@Test
	@DisplayName("Record 3616: Address is 1831 W Evans St")
	void AddressOfRecord3616() {
		assertEquals("1831 W Evans St", customers.get(3615).getAddress());
	}

	@Test
	@DisplayName("Record 3616: City is Florence")
	void CityOfRecord3616() {
		assertEquals("Florence", customers.get(3615).getCity());
	}

	@Test
	@DisplayName("Record 3616: County is Florence")
	void CountyOfRecord3616() {
		assertEquals("Florence", customers.get(3615).getCounty());
	}

	@Test
	@DisplayName("Record 3616: State is SC")
	void StateOfRecord3616() {
		assertEquals("SC", customers.get(3615).getState());
	}

	@Test
	@DisplayName("Record 3616: ZIP is 29501")
	void ZIPOfRecord3616() {
		assertEquals("29501", customers.get(3615).getZIP());
	}

	@Test
	@DisplayName("Record 3616: Phone is 843-662-6940")
	void PhoneOfRecord3616() {
		assertEquals("843-662-6940", customers.get(3615).getPhone());
	}

	@Test
	@DisplayName("Record 3616: Fax is 843-662-3909")
	void FaxOfRecord3616() {
		assertEquals("843-662-3909", customers.get(3615).getFax());
	}

	@Test
	@DisplayName("Record 3616: Email is toby@gollop.com")
	void EmailOfRecord3616() {
		assertEquals("toby@gollop.com", customers.get(3615).getEmail());
	}

	@Test
	@DisplayName("Record 3616: Web is http://www.tobygollop.com")
	void WebOfRecord3616() {
		assertEquals("http://www.tobygollop.com", customers.get(3615).getWeb());
	}
}
