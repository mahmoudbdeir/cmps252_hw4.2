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

@Tag("4")
class Record_2113 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2113: FirstName is Osvaldo")
	void FirstNameOfRecord2113() {
		assertEquals("Osvaldo", customers.get(2112).getFirstName());
	}

	@Test
	@DisplayName("Record 2113: LastName is Bahena")
	void LastNameOfRecord2113() {
		assertEquals("Bahena", customers.get(2112).getLastName());
	}

	@Test
	@DisplayName("Record 2113: Company is Peerless Packages Inc")
	void CompanyOfRecord2113() {
		assertEquals("Peerless Packages Inc", customers.get(2112).getCompany());
	}

	@Test
	@DisplayName("Record 2113: Address is 2280 Diamond Blvd  #-345")
	void AddressOfRecord2113() {
		assertEquals("2280 Diamond Blvd  #-345", customers.get(2112).getAddress());
	}

	@Test
	@DisplayName("Record 2113: City is Concord")
	void CityOfRecord2113() {
		assertEquals("Concord", customers.get(2112).getCity());
	}

	@Test
	@DisplayName("Record 2113: County is Contra Costa")
	void CountyOfRecord2113() {
		assertEquals("Contra Costa", customers.get(2112).getCounty());
	}

	@Test
	@DisplayName("Record 2113: State is CA")
	void StateOfRecord2113() {
		assertEquals("CA", customers.get(2112).getState());
	}

	@Test
	@DisplayName("Record 2113: ZIP is 94520")
	void ZIPOfRecord2113() {
		assertEquals("94520", customers.get(2112).getZIP());
	}

	@Test
	@DisplayName("Record 2113: Phone is 925-827-4681")
	void PhoneOfRecord2113() {
		assertEquals("925-827-4681", customers.get(2112).getPhone());
	}

	@Test
	@DisplayName("Record 2113: Fax is 925-827-1109")
	void FaxOfRecord2113() {
		assertEquals("925-827-1109", customers.get(2112).getFax());
	}

	@Test
	@DisplayName("Record 2113: Email is osvaldo@bahena.com")
	void EmailOfRecord2113() {
		assertEquals("osvaldo@bahena.com", customers.get(2112).getEmail());
	}

	@Test
	@DisplayName("Record 2113: Web is http://www.osvaldobahena.com")
	void WebOfRecord2113() {
		assertEquals("http://www.osvaldobahena.com", customers.get(2112).getWeb());
	}
}
