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

@Tag("13")
class Record_4098 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4098: FirstName is Tawana")
	void FirstNameOfRecord4098() {
		assertEquals("Tawana", customers.get(4097).getFirstName());
	}

	@Test
	@DisplayName("Record 4098: LastName is Wasser")
	void LastNameOfRecord4098() {
		assertEquals("Wasser", customers.get(4097).getLastName());
	}

	@Test
	@DisplayName("Record 4098: Company is Bair Bormann & Bair")
	void CompanyOfRecord4098() {
		assertEquals("Bair Bormann & Bair", customers.get(4097).getCompany());
	}

	@Test
	@DisplayName("Record 4098: Address is 2329 Lee Ave")
	void AddressOfRecord4098() {
		assertEquals("2329 Lee Ave", customers.get(4097).getAddress());
	}

	@Test
	@DisplayName("Record 4098: City is South El Monte")
	void CityOfRecord4098() {
		assertEquals("South El Monte", customers.get(4097).getCity());
	}

	@Test
	@DisplayName("Record 4098: County is Los Angeles")
	void CountyOfRecord4098() {
		assertEquals("Los Angeles", customers.get(4097).getCounty());
	}

	@Test
	@DisplayName("Record 4098: State is CA")
	void StateOfRecord4098() {
		assertEquals("CA", customers.get(4097).getState());
	}

	@Test
	@DisplayName("Record 4098: ZIP is 91733")
	void ZIPOfRecord4098() {
		assertEquals("91733", customers.get(4097).getZIP());
	}

	@Test
	@DisplayName("Record 4098: Phone is 626-443-2773")
	void PhoneOfRecord4098() {
		assertEquals("626-443-2773", customers.get(4097).getPhone());
	}

	@Test
	@DisplayName("Record 4098: Fax is 626-443-9746")
	void FaxOfRecord4098() {
		assertEquals("626-443-9746", customers.get(4097).getFax());
	}

	@Test
	@DisplayName("Record 4098: Email is tawana@wasser.com")
	void EmailOfRecord4098() {
		assertEquals("tawana@wasser.com", customers.get(4097).getEmail());
	}

	@Test
	@DisplayName("Record 4098: Web is http://www.tawanawasser.com")
	void WebOfRecord4098() {
		assertEquals("http://www.tawanawasser.com", customers.get(4097).getWeb());
	}
}
