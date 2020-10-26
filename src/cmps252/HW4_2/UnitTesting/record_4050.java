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

@Tag("27")
class Record_4050 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4050: FirstName is Danette")
	void FirstNameOfRecord4050() {
		assertEquals("Danette", customers.get(4049).getFirstName());
	}

	@Test
	@DisplayName("Record 4050: LastName is Wyssert")
	void LastNameOfRecord4050() {
		assertEquals("Wyssert", customers.get(4049).getLastName());
	}

	@Test
	@DisplayName("Record 4050: Company is Hamilton Hallmark Electronics")
	void CompanyOfRecord4050() {
		assertEquals("Hamilton Hallmark Electronics", customers.get(4049).getCompany());
	}

	@Test
	@DisplayName("Record 4050: Address is 627 Hancock St")
	void AddressOfRecord4050() {
		assertEquals("627 Hancock St", customers.get(4049).getAddress());
	}

	@Test
	@DisplayName("Record 4050: City is Abington")
	void CityOfRecord4050() {
		assertEquals("Abington", customers.get(4049).getCity());
	}

	@Test
	@DisplayName("Record 4050: County is Plymouth")
	void CountyOfRecord4050() {
		assertEquals("Plymouth", customers.get(4049).getCounty());
	}

	@Test
	@DisplayName("Record 4050: State is MA")
	void StateOfRecord4050() {
		assertEquals("MA", customers.get(4049).getState());
	}

	@Test
	@DisplayName("Record 4050: ZIP is 2351")
	void ZIPOfRecord4050() {
		assertEquals("2351", customers.get(4049).getZIP());
	}

	@Test
	@DisplayName("Record 4050: Phone is 781-871-3964")
	void PhoneOfRecord4050() {
		assertEquals("781-871-3964", customers.get(4049).getPhone());
	}

	@Test
	@DisplayName("Record 4050: Fax is 781-871-4609")
	void FaxOfRecord4050() {
		assertEquals("781-871-4609", customers.get(4049).getFax());
	}

	@Test
	@DisplayName("Record 4050: Email is danette@wyssert.com")
	void EmailOfRecord4050() {
		assertEquals("danette@wyssert.com", customers.get(4049).getEmail());
	}

	@Test
	@DisplayName("Record 4050: Web is http://www.danettewyssert.com")
	void WebOfRecord4050() {
		assertEquals("http://www.danettewyssert.com", customers.get(4049).getWeb());
	}
}
