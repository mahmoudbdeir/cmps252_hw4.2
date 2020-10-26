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

@Tag("16")
class Record_2330 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2330: FirstName is Ethel")
	void FirstNameOfRecord2330() {
		assertEquals("Ethel", customers.get(2329).getFirstName());
	}

	@Test
	@DisplayName("Record 2330: LastName is Pico")
	void LastNameOfRecord2330() {
		assertEquals("Pico", customers.get(2329).getLastName());
	}

	@Test
	@DisplayName("Record 2330: Company is Theken Assocs Inc")
	void CompanyOfRecord2330() {
		assertEquals("Theken Assocs Inc", customers.get(2329).getCompany());
	}

	@Test
	@DisplayName("Record 2330: Address is 651e Fm")
	void AddressOfRecord2330() {
		assertEquals("651e Fm", customers.get(2329).getAddress());
	}

	@Test
	@DisplayName("Record 2330: City is League City")
	void CityOfRecord2330() {
		assertEquals("League City", customers.get(2329).getCity());
	}

	@Test
	@DisplayName("Record 2330: County is Galveston")
	void CountyOfRecord2330() {
		assertEquals("Galveston", customers.get(2329).getCounty());
	}

	@Test
	@DisplayName("Record 2330: State is TX")
	void StateOfRecord2330() {
		assertEquals("TX", customers.get(2329).getState());
	}

	@Test
	@DisplayName("Record 2330: ZIP is 77573")
	void ZIPOfRecord2330() {
		assertEquals("77573", customers.get(2329).getZIP());
	}

	@Test
	@DisplayName("Record 2330: Phone is 281-554-5757")
	void PhoneOfRecord2330() {
		assertEquals("281-554-5757", customers.get(2329).getPhone());
	}

	@Test
	@DisplayName("Record 2330: Fax is 281-554-0073")
	void FaxOfRecord2330() {
		assertEquals("281-554-0073", customers.get(2329).getFax());
	}

	@Test
	@DisplayName("Record 2330: Email is ethel@pico.com")
	void EmailOfRecord2330() {
		assertEquals("ethel@pico.com", customers.get(2329).getEmail());
	}

	@Test
	@DisplayName("Record 2330: Web is http://www.ethelpico.com")
	void WebOfRecord2330() {
		assertEquals("http://www.ethelpico.com", customers.get(2329).getWeb());
	}
}
