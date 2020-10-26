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

@Tag("43")
class Record_426 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 426: FirstName is Fermin")
	void FirstNameOfRecord426() {
		assertEquals("Fermin", customers.get(425).getFirstName());
	}

	@Test
	@DisplayName("Record 426: LastName is Skwara")
	void LastNameOfRecord426() {
		assertEquals("Skwara", customers.get(425).getLastName());
	}

	@Test
	@DisplayName("Record 426: Company is Wedge Machine & Tool")
	void CompanyOfRecord426() {
		assertEquals("Wedge Machine & Tool", customers.get(425).getCompany());
	}

	@Test
	@DisplayName("Record 426: Address is 126 Kenton Lands Rd")
	void AddressOfRecord426() {
		assertEquals("126 Kenton Lands Rd", customers.get(425).getAddress());
	}

	@Test
	@DisplayName("Record 426: City is Erlanger")
	void CityOfRecord426() {
		assertEquals("Erlanger", customers.get(425).getCity());
	}

	@Test
	@DisplayName("Record 426: County is Kenton")
	void CountyOfRecord426() {
		assertEquals("Kenton", customers.get(425).getCounty());
	}

	@Test
	@DisplayName("Record 426: State is KY")
	void StateOfRecord426() {
		assertEquals("KY", customers.get(425).getState());
	}

	@Test
	@DisplayName("Record 426: ZIP is 41018")
	void ZIPOfRecord426() {
		assertEquals("41018", customers.get(425).getZIP());
	}

	@Test
	@DisplayName("Record 426: Phone is 859-727-6271")
	void PhoneOfRecord426() {
		assertEquals("859-727-6271", customers.get(425).getPhone());
	}

	@Test
	@DisplayName("Record 426: Fax is 859-727-0778")
	void FaxOfRecord426() {
		assertEquals("859-727-0778", customers.get(425).getFax());
	}

	@Test
	@DisplayName("Record 426: Email is fermin@skwara.com")
	void EmailOfRecord426() {
		assertEquals("fermin@skwara.com", customers.get(425).getEmail());
	}

	@Test
	@DisplayName("Record 426: Web is http://www.ferminskwara.com")
	void WebOfRecord426() {
		assertEquals("http://www.ferminskwara.com", customers.get(425).getWeb());
	}
}
