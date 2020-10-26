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

@Tag("28")
class Record_4740 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4740: FirstName is Myles")
	void FirstNameOfRecord4740() {
		assertEquals("Myles", customers.get(4739).getFirstName());
	}

	@Test
	@DisplayName("Record 4740: LastName is Wengerd")
	void LastNameOfRecord4740() {
		assertEquals("Wengerd", customers.get(4739).getLastName());
	}

	@Test
	@DisplayName("Record 4740: Company is De Gelleke, Peter G Esq")
	void CompanyOfRecord4740() {
		assertEquals("De Gelleke, Peter G Esq", customers.get(4739).getCompany());
	}

	@Test
	@DisplayName("Record 4740: Address is 2435 Kimberly Rd")
	void AddressOfRecord4740() {
		assertEquals("2435 Kimberly Rd", customers.get(4739).getAddress());
	}

	@Test
	@DisplayName("Record 4740: City is Bettendorf")
	void CityOfRecord4740() {
		assertEquals("Bettendorf", customers.get(4739).getCity());
	}

	@Test
	@DisplayName("Record 4740: County is Scott")
	void CountyOfRecord4740() {
		assertEquals("Scott", customers.get(4739).getCounty());
	}

	@Test
	@DisplayName("Record 4740: State is IA")
	void StateOfRecord4740() {
		assertEquals("IA", customers.get(4739).getState());
	}

	@Test
	@DisplayName("Record 4740: ZIP is 52722")
	void ZIPOfRecord4740() {
		assertEquals("52722", customers.get(4739).getZIP());
	}

	@Test
	@DisplayName("Record 4740: Phone is 563-355-0284")
	void PhoneOfRecord4740() {
		assertEquals("563-355-0284", customers.get(4739).getPhone());
	}

	@Test
	@DisplayName("Record 4740: Fax is 563-355-3243")
	void FaxOfRecord4740() {
		assertEquals("563-355-3243", customers.get(4739).getFax());
	}

	@Test
	@DisplayName("Record 4740: Email is myles@wengerd.com")
	void EmailOfRecord4740() {
		assertEquals("myles@wengerd.com", customers.get(4739).getEmail());
	}

	@Test
	@DisplayName("Record 4740: Web is http://www.myleswengerd.com")
	void WebOfRecord4740() {
		assertEquals("http://www.myleswengerd.com", customers.get(4739).getWeb());
	}
}
