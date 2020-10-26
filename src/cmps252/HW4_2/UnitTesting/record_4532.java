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

@Tag("22")
class Record_4532 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4532: FirstName is Lonny")
	void FirstNameOfRecord4532() {
		assertEquals("Lonny", customers.get(4531).getFirstName());
	}

	@Test
	@DisplayName("Record 4532: LastName is Descoteau")
	void LastNameOfRecord4532() {
		assertEquals("Descoteau", customers.get(4531).getLastName());
	}

	@Test
	@DisplayName("Record 4532: Company is A & A Custodial Svc Gerrus")
	void CompanyOfRecord4532() {
		assertEquals("A & A Custodial Svc Gerrus", customers.get(4531).getCompany());
	}

	@Test
	@DisplayName("Record 4532: Address is 10777 Nw 36th Ave")
	void AddressOfRecord4532() {
		assertEquals("10777 Nw 36th Ave", customers.get(4531).getAddress());
	}

	@Test
	@DisplayName("Record 4532: City is Miami")
	void CityOfRecord4532() {
		assertEquals("Miami", customers.get(4531).getCity());
	}

	@Test
	@DisplayName("Record 4532: County is Miami-Dade")
	void CountyOfRecord4532() {
		assertEquals("Miami-Dade", customers.get(4531).getCounty());
	}

	@Test
	@DisplayName("Record 4532: State is FL")
	void StateOfRecord4532() {
		assertEquals("FL", customers.get(4531).getState());
	}

	@Test
	@DisplayName("Record 4532: ZIP is 33167")
	void ZIPOfRecord4532() {
		assertEquals("33167", customers.get(4531).getZIP());
	}

	@Test
	@DisplayName("Record 4532: Phone is 305-769-2889")
	void PhoneOfRecord4532() {
		assertEquals("305-769-2889", customers.get(4531).getPhone());
	}

	@Test
	@DisplayName("Record 4532: Fax is 305-769-2371")
	void FaxOfRecord4532() {
		assertEquals("305-769-2371", customers.get(4531).getFax());
	}

	@Test
	@DisplayName("Record 4532: Email is lonny@descoteau.com")
	void EmailOfRecord4532() {
		assertEquals("lonny@descoteau.com", customers.get(4531).getEmail());
	}

	@Test
	@DisplayName("Record 4532: Web is http://www.lonnydescoteau.com")
	void WebOfRecord4532() {
		assertEquals("http://www.lonnydescoteau.com", customers.get(4531).getWeb());
	}
}
