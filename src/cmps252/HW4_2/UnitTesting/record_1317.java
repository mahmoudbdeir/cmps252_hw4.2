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

@Tag("42")
class Record_1317 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1317: FirstName is Lon")
	void FirstNameOfRecord1317() {
		assertEquals("Lon", customers.get(1316).getFirstName());
	}

	@Test
	@DisplayName("Record 1317: LastName is Poertner")
	void LastNameOfRecord1317() {
		assertEquals("Poertner", customers.get(1316).getLastName());
	}

	@Test
	@DisplayName("Record 1317: Company is Mandarin House Restaurant")
	void CompanyOfRecord1317() {
		assertEquals("Mandarin House Restaurant", customers.get(1316).getCompany());
	}

	@Test
	@DisplayName("Record 1317: Address is 2205 Victoria St")
	void AddressOfRecord1317() {
		assertEquals("2205 Victoria St", customers.get(1316).getAddress());
	}

	@Test
	@DisplayName("Record 1317: City is Laredo")
	void CityOfRecord1317() {
		assertEquals("Laredo", customers.get(1316).getCity());
	}

	@Test
	@DisplayName("Record 1317: County is Webb")
	void CountyOfRecord1317() {
		assertEquals("Webb", customers.get(1316).getCounty());
	}

	@Test
	@DisplayName("Record 1317: State is TX")
	void StateOfRecord1317() {
		assertEquals("TX", customers.get(1316).getState());
	}

	@Test
	@DisplayName("Record 1317: ZIP is 78040")
	void ZIPOfRecord1317() {
		assertEquals("78040", customers.get(1316).getZIP());
	}

	@Test
	@DisplayName("Record 1317: Phone is 956-725-5663")
	void PhoneOfRecord1317() {
		assertEquals("956-725-5663", customers.get(1316).getPhone());
	}

	@Test
	@DisplayName("Record 1317: Fax is 956-725-6012")
	void FaxOfRecord1317() {
		assertEquals("956-725-6012", customers.get(1316).getFax());
	}

	@Test
	@DisplayName("Record 1317: Email is lon@poertner.com")
	void EmailOfRecord1317() {
		assertEquals("lon@poertner.com", customers.get(1316).getEmail());
	}

	@Test
	@DisplayName("Record 1317: Web is http://www.lonpoertner.com")
	void WebOfRecord1317() {
		assertEquals("http://www.lonpoertner.com", customers.get(1316).getWeb());
	}
}
