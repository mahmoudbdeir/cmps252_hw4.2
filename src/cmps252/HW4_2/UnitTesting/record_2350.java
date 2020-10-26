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

@Tag("48")
class Record_2350 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2350: FirstName is Anna")
	void FirstNameOfRecord2350() {
		assertEquals("Anna", customers.get(2349).getFirstName());
	}

	@Test
	@DisplayName("Record 2350: LastName is Killer")
	void LastNameOfRecord2350() {
		assertEquals("Killer", customers.get(2349).getLastName());
	}

	@Test
	@DisplayName("Record 2350: Company is Coating Systems Inc")
	void CompanyOfRecord2350() {
		assertEquals("Coating Systems Inc", customers.get(2349).getCompany());
	}

	@Test
	@DisplayName("Record 2350: Address is 11840 Westhymer Rd")
	void AddressOfRecord2350() {
		assertEquals("11840 Westhymer Rd", customers.get(2349).getAddress());
	}

	@Test
	@DisplayName("Record 2350: City is Houston")
	void CityOfRecord2350() {
		assertEquals("Houston", customers.get(2349).getCity());
	}

	@Test
	@DisplayName("Record 2350: County is Harris")
	void CountyOfRecord2350() {
		assertEquals("Harris", customers.get(2349).getCounty());
	}

	@Test
	@DisplayName("Record 2350: State is TX")
	void StateOfRecord2350() {
		assertEquals("TX", customers.get(2349).getState());
	}

	@Test
	@DisplayName("Record 2350: ZIP is 77077")
	void ZIPOfRecord2350() {
		assertEquals("77077", customers.get(2349).getZIP());
	}

	@Test
	@DisplayName("Record 2350: Phone is 281-558-4450")
	void PhoneOfRecord2350() {
		assertEquals("281-558-4450", customers.get(2349).getPhone());
	}

	@Test
	@DisplayName("Record 2350: Fax is 281-558-5434")
	void FaxOfRecord2350() {
		assertEquals("281-558-5434", customers.get(2349).getFax());
	}

	@Test
	@DisplayName("Record 2350: Email is anna@killer.com")
	void EmailOfRecord2350() {
		assertEquals("anna@killer.com", customers.get(2349).getEmail());
	}

	@Test
	@DisplayName("Record 2350: Web is http://www.annakiller.com")
	void WebOfRecord2350() {
		assertEquals("http://www.annakiller.com", customers.get(2349).getWeb());
	}
}
