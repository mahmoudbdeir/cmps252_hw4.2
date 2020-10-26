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

@Tag("12")
class Record_4636 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4636: FirstName is Clayton")
	void FirstNameOfRecord4636() {
		assertEquals("Clayton", customers.get(4635).getFirstName());
	}

	@Test
	@DisplayName("Record 4636: LastName is Spuler")
	void LastNameOfRecord4636() {
		assertEquals("Spuler", customers.get(4635).getLastName());
	}

	@Test
	@DisplayName("Record 4636: Company is Hoyt Miller & Angstadt Pro")
	void CompanyOfRecord4636() {
		assertEquals("Hoyt Miller & Angstadt Pro", customers.get(4635).getCompany());
	}

	@Test
	@DisplayName("Record 4636: Address is 1100 N Town East Blvd")
	void AddressOfRecord4636() {
		assertEquals("1100 N Town East Blvd", customers.get(4635).getAddress());
	}

	@Test
	@DisplayName("Record 4636: City is Mesquite")
	void CityOfRecord4636() {
		assertEquals("Mesquite", customers.get(4635).getCity());
	}

	@Test
	@DisplayName("Record 4636: County is Dallas")
	void CountyOfRecord4636() {
		assertEquals("Dallas", customers.get(4635).getCounty());
	}

	@Test
	@DisplayName("Record 4636: State is TX")
	void StateOfRecord4636() {
		assertEquals("TX", customers.get(4635).getState());
	}

	@Test
	@DisplayName("Record 4636: ZIP is 75150")
	void ZIPOfRecord4636() {
		assertEquals("75150", customers.get(4635).getZIP());
	}

	@Test
	@DisplayName("Record 4636: Phone is 972-686-7862")
	void PhoneOfRecord4636() {
		assertEquals("972-686-7862", customers.get(4635).getPhone());
	}

	@Test
	@DisplayName("Record 4636: Fax is 972-686-3253")
	void FaxOfRecord4636() {
		assertEquals("972-686-3253", customers.get(4635).getFax());
	}

	@Test
	@DisplayName("Record 4636: Email is clayton@spuler.com")
	void EmailOfRecord4636() {
		assertEquals("clayton@spuler.com", customers.get(4635).getEmail());
	}

	@Test
	@DisplayName("Record 4636: Web is http://www.claytonspuler.com")
	void WebOfRecord4636() {
		assertEquals("http://www.claytonspuler.com", customers.get(4635).getWeb());
	}
}
