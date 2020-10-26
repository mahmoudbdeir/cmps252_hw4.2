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

@Tag("37")
class Record_2721 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2721: FirstName is Lindsay")
	void FirstNameOfRecord2721() {
		assertEquals("Lindsay", customers.get(2720).getFirstName());
	}

	@Test
	@DisplayName("Record 2721: LastName is Asato")
	void LastNameOfRecord2721() {
		assertEquals("Asato", customers.get(2720).getLastName());
	}

	@Test
	@DisplayName("Record 2721: Company is Phillips Haynes & Egger Llp")
	void CompanyOfRecord2721() {
		assertEquals("Phillips Haynes & Egger Llp", customers.get(2720).getCompany());
	}

	@Test
	@DisplayName("Record 2721: Address is 114 W Gay St  #-300")
	void AddressOfRecord2721() {
		assertEquals("114 W Gay St  #-300", customers.get(2720).getAddress());
	}

	@Test
	@DisplayName("Record 2721: City is West Chester")
	void CityOfRecord2721() {
		assertEquals("West Chester", customers.get(2720).getCity());
	}

	@Test
	@DisplayName("Record 2721: County is Chester")
	void CountyOfRecord2721() {
		assertEquals("Chester", customers.get(2720).getCounty());
	}

	@Test
	@DisplayName("Record 2721: State is PA")
	void StateOfRecord2721() {
		assertEquals("PA", customers.get(2720).getState());
	}

	@Test
	@DisplayName("Record 2721: ZIP is 19380")
	void ZIPOfRecord2721() {
		assertEquals("19380", customers.get(2720).getZIP());
	}

	@Test
	@DisplayName("Record 2721: Phone is 610-692-4530")
	void PhoneOfRecord2721() {
		assertEquals("610-692-4530", customers.get(2720).getPhone());
	}

	@Test
	@DisplayName("Record 2721: Fax is 610-692-9061")
	void FaxOfRecord2721() {
		assertEquals("610-692-9061", customers.get(2720).getFax());
	}

	@Test
	@DisplayName("Record 2721: Email is lindsay@asato.com")
	void EmailOfRecord2721() {
		assertEquals("lindsay@asato.com", customers.get(2720).getEmail());
	}

	@Test
	@DisplayName("Record 2721: Web is http://www.lindsayasato.com")
	void WebOfRecord2721() {
		assertEquals("http://www.lindsayasato.com", customers.get(2720).getWeb());
	}
}
