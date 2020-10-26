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
class Record_1144 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1144: FirstName is Dalton")
	void FirstNameOfRecord1144() {
		assertEquals("Dalton", customers.get(1143).getFirstName());
	}

	@Test
	@DisplayName("Record 1144: LastName is Szumny")
	void LastNameOfRecord1144() {
		assertEquals("Szumny", customers.get(1143).getLastName());
	}

	@Test
	@DisplayName("Record 1144: Company is Swickard Chiropractic Clnc Pc")
	void CompanyOfRecord1144() {
		assertEquals("Swickard Chiropractic Clnc Pc", customers.get(1143).getCompany());
	}

	@Test
	@DisplayName("Record 1144: Address is 36 2nd St")
	void AddressOfRecord1144() {
		assertEquals("36 2nd St", customers.get(1143).getAddress());
	}

	@Test
	@DisplayName("Record 1144: City is San Francisco")
	void CityOfRecord1144() {
		assertEquals("San Francisco", customers.get(1143).getCity());
	}

	@Test
	@DisplayName("Record 1144: County is San Francisco")
	void CountyOfRecord1144() {
		assertEquals("San Francisco", customers.get(1143).getCounty());
	}

	@Test
	@DisplayName("Record 1144: State is CA")
	void StateOfRecord1144() {
		assertEquals("CA", customers.get(1143).getState());
	}

	@Test
	@DisplayName("Record 1144: ZIP is 94105")
	void ZIPOfRecord1144() {
		assertEquals("94105", customers.get(1143).getZIP());
	}

	@Test
	@DisplayName("Record 1144: Phone is 415-495-3668")
	void PhoneOfRecord1144() {
		assertEquals("415-495-3668", customers.get(1143).getPhone());
	}

	@Test
	@DisplayName("Record 1144: Fax is 415-495-0521")
	void FaxOfRecord1144() {
		assertEquals("415-495-0521", customers.get(1143).getFax());
	}

	@Test
	@DisplayName("Record 1144: Email is dalton@szumny.com")
	void EmailOfRecord1144() {
		assertEquals("dalton@szumny.com", customers.get(1143).getEmail());
	}

	@Test
	@DisplayName("Record 1144: Web is http://www.daltonszumny.com")
	void WebOfRecord1144() {
		assertEquals("http://www.daltonszumny.com", customers.get(1143).getWeb());
	}
}
