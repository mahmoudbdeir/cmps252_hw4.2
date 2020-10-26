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

@Tag("38")
class Record_631 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 631: FirstName is Manual")
	void FirstNameOfRecord631() {
		assertEquals("Manual", customers.get(630).getFirstName());
	}

	@Test
	@DisplayName("Record 631: LastName is Fasulo")
	void LastNameOfRecord631() {
		assertEquals("Fasulo", customers.get(630).getLastName());
	}

	@Test
	@DisplayName("Record 631: Company is Wplm Fm Radio Station")
	void CompanyOfRecord631() {
		assertEquals("Wplm Fm Radio Station", customers.get(630).getCompany());
	}

	@Test
	@DisplayName("Record 631: Address is 459 Calle De La")
	void AddressOfRecord631() {
		assertEquals("459 Calle De La", customers.get(630).getAddress());
	}

	@Test
	@DisplayName("Record 631: City is Novato")
	void CityOfRecord631() {
		assertEquals("Novato", customers.get(630).getCity());
	}

	@Test
	@DisplayName("Record 631: County is Marin")
	void CountyOfRecord631() {
		assertEquals("Marin", customers.get(630).getCounty());
	}

	@Test
	@DisplayName("Record 631: State is CA")
	void StateOfRecord631() {
		assertEquals("CA", customers.get(630).getState());
	}

	@Test
	@DisplayName("Record 631: ZIP is 94949")
	void ZIPOfRecord631() {
		assertEquals("94949", customers.get(630).getZIP());
	}

	@Test
	@DisplayName("Record 631: Phone is 415-884-7311")
	void PhoneOfRecord631() {
		assertEquals("415-884-7311", customers.get(630).getPhone());
	}

	@Test
	@DisplayName("Record 631: Fax is 415-884-1865")
	void FaxOfRecord631() {
		assertEquals("415-884-1865", customers.get(630).getFax());
	}

	@Test
	@DisplayName("Record 631: Email is manual@fasulo.com")
	void EmailOfRecord631() {
		assertEquals("manual@fasulo.com", customers.get(630).getEmail());
	}

	@Test
	@DisplayName("Record 631: Web is http://www.manualfasulo.com")
	void WebOfRecord631() {
		assertEquals("http://www.manualfasulo.com", customers.get(630).getWeb());
	}
}
