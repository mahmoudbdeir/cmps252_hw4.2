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

@Tag("10")
class Record_2056 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2056: FirstName is Maria")
	void FirstNameOfRecord2056() {
		assertEquals("Maria", customers.get(2055).getFirstName());
	}

	@Test
	@DisplayName("Record 2056: LastName is Musch")
	void LastNameOfRecord2056() {
		assertEquals("Musch", customers.get(2055).getLastName());
	}

	@Test
	@DisplayName("Record 2056: Company is Asap Accounting Personnel Svc")
	void CompanyOfRecord2056() {
		assertEquals("Asap Accounting Personnel Svc", customers.get(2055).getCompany());
	}

	@Test
	@DisplayName("Record 2056: Address is 2007 Whitaker Way")
	void AddressOfRecord2056() {
		assertEquals("2007 Whitaker Way", customers.get(2055).getAddress());
	}

	@Test
	@DisplayName("Record 2056: City is Homestead")
	void CityOfRecord2056() {
		assertEquals("Homestead", customers.get(2055).getCity());
	}

	@Test
	@DisplayName("Record 2056: County is Allegheny")
	void CountyOfRecord2056() {
		assertEquals("Allegheny", customers.get(2055).getCounty());
	}

	@Test
	@DisplayName("Record 2056: State is PA")
	void StateOfRecord2056() {
		assertEquals("PA", customers.get(2055).getState());
	}

	@Test
	@DisplayName("Record 2056: ZIP is 15120")
	void ZIPOfRecord2056() {
		assertEquals("15120", customers.get(2055).getZIP());
	}

	@Test
	@DisplayName("Record 2056: Phone is 412-461-1190")
	void PhoneOfRecord2056() {
		assertEquals("412-461-1190", customers.get(2055).getPhone());
	}

	@Test
	@DisplayName("Record 2056: Fax is 412-461-1203")
	void FaxOfRecord2056() {
		assertEquals("412-461-1203", customers.get(2055).getFax());
	}

	@Test
	@DisplayName("Record 2056: Email is maria@musch.com")
	void EmailOfRecord2056() {
		assertEquals("maria@musch.com", customers.get(2055).getEmail());
	}

	@Test
	@DisplayName("Record 2056: Web is http://www.mariamusch.com")
	void WebOfRecord2056() {
		assertEquals("http://www.mariamusch.com", customers.get(2055).getWeb());
	}
}
