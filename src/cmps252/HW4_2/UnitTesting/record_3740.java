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

@Tag("35")
class Record_3740 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3740: FirstName is Hazel")
	void FirstNameOfRecord3740() {
		assertEquals("Hazel", customers.get(3739).getFirstName());
	}

	@Test
	@DisplayName("Record 3740: LastName is Hamiter")
	void LastNameOfRecord3740() {
		assertEquals("Hamiter", customers.get(3739).getLastName());
	}

	@Test
	@DisplayName("Record 3740: Company is P W S Enterprises")
	void CompanyOfRecord3740() {
		assertEquals("P W S Enterprises", customers.get(3739).getCompany());
	}

	@Test
	@DisplayName("Record 3740: Address is 3401 Conflans Rd")
	void AddressOfRecord3740() {
		assertEquals("3401 Conflans Rd", customers.get(3739).getAddress());
	}

	@Test
	@DisplayName("Record 3740: City is Irving")
	void CityOfRecord3740() {
		assertEquals("Irving", customers.get(3739).getCity());
	}

	@Test
	@DisplayName("Record 3740: County is Dallas")
	void CountyOfRecord3740() {
		assertEquals("Dallas", customers.get(3739).getCounty());
	}

	@Test
	@DisplayName("Record 3740: State is TX")
	void StateOfRecord3740() {
		assertEquals("TX", customers.get(3739).getState());
	}

	@Test
	@DisplayName("Record 3740: ZIP is 75061")
	void ZIPOfRecord3740() {
		assertEquals("75061", customers.get(3739).getZIP());
	}

	@Test
	@DisplayName("Record 3740: Phone is 972-790-9989")
	void PhoneOfRecord3740() {
		assertEquals("972-790-9989", customers.get(3739).getPhone());
	}

	@Test
	@DisplayName("Record 3740: Fax is 972-790-1952")
	void FaxOfRecord3740() {
		assertEquals("972-790-1952", customers.get(3739).getFax());
	}

	@Test
	@DisplayName("Record 3740: Email is hazel@hamiter.com")
	void EmailOfRecord3740() {
		assertEquals("hazel@hamiter.com", customers.get(3739).getEmail());
	}

	@Test
	@DisplayName("Record 3740: Web is http://www.hazelhamiter.com")
	void WebOfRecord3740() {
		assertEquals("http://www.hazelhamiter.com", customers.get(3739).getWeb());
	}
}
