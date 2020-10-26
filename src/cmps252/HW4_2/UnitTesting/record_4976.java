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
class Record_4976 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4976: FirstName is Deana")
	void FirstNameOfRecord4976() {
		assertEquals("Deana", customers.get(4975).getFirstName());
	}

	@Test
	@DisplayName("Record 4976: LastName is Leckband")
	void LastNameOfRecord4976() {
		assertEquals("Leckband", customers.get(4975).getLastName());
	}

	@Test
	@DisplayName("Record 4976: Company is Sovie & Bowie Cpa Pc")
	void CompanyOfRecord4976() {
		assertEquals("Sovie & Bowie Cpa Pc", customers.get(4975).getCompany());
	}

	@Test
	@DisplayName("Record 4976: Address is 135 Parrott St")
	void AddressOfRecord4976() {
		assertEquals("135 Parrott St", customers.get(4975).getAddress());
	}

	@Test
	@DisplayName("Record 4976: City is San Leandro")
	void CityOfRecord4976() {
		assertEquals("San Leandro", customers.get(4975).getCity());
	}

	@Test
	@DisplayName("Record 4976: County is Alameda")
	void CountyOfRecord4976() {
		assertEquals("Alameda", customers.get(4975).getCounty());
	}

	@Test
	@DisplayName("Record 4976: State is CA")
	void StateOfRecord4976() {
		assertEquals("CA", customers.get(4975).getState());
	}

	@Test
	@DisplayName("Record 4976: ZIP is 94577")
	void ZIPOfRecord4976() {
		assertEquals("94577", customers.get(4975).getZIP());
	}

	@Test
	@DisplayName("Record 4976: Phone is 510-352-7712")
	void PhoneOfRecord4976() {
		assertEquals("510-352-7712", customers.get(4975).getPhone());
	}

	@Test
	@DisplayName("Record 4976: Fax is 510-352-6193")
	void FaxOfRecord4976() {
		assertEquals("510-352-6193", customers.get(4975).getFax());
	}

	@Test
	@DisplayName("Record 4976: Email is deana@leckband.com")
	void EmailOfRecord4976() {
		assertEquals("deana@leckband.com", customers.get(4975).getEmail());
	}

	@Test
	@DisplayName("Record 4976: Web is http://www.deanaleckband.com")
	void WebOfRecord4976() {
		assertEquals("http://www.deanaleckband.com", customers.get(4975).getWeb());
	}
}
