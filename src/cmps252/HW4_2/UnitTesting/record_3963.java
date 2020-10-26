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
class Record_3963 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3963: FirstName is Kendall")
	void FirstNameOfRecord3963() {
		assertEquals("Kendall", customers.get(3962).getFirstName());
	}

	@Test
	@DisplayName("Record 3963: LastName is Tank")
	void LastNameOfRecord3963() {
		assertEquals("Tank", customers.get(3962).getLastName());
	}

	@Test
	@DisplayName("Record 3963: Company is First National Bank Pipestone")
	void CompanyOfRecord3963() {
		assertEquals("First National Bank Pipestone", customers.get(3962).getCompany());
	}

	@Test
	@DisplayName("Record 3963: Address is 3120 S Church St")
	void AddressOfRecord3963() {
		assertEquals("3120 S Church St", customers.get(3962).getAddress());
	}

	@Test
	@DisplayName("Record 3963: City is Burlington")
	void CityOfRecord3963() {
		assertEquals("Burlington", customers.get(3962).getCity());
	}

	@Test
	@DisplayName("Record 3963: County is Alamance")
	void CountyOfRecord3963() {
		assertEquals("Alamance", customers.get(3962).getCounty());
	}

	@Test
	@DisplayName("Record 3963: State is NC")
	void StateOfRecord3963() {
		assertEquals("NC", customers.get(3962).getState());
	}

	@Test
	@DisplayName("Record 3963: ZIP is 27215")
	void ZIPOfRecord3963() {
		assertEquals("27215", customers.get(3962).getZIP());
	}

	@Test
	@DisplayName("Record 3963: Phone is 336-584-9159")
	void PhoneOfRecord3963() {
		assertEquals("336-584-9159", customers.get(3962).getPhone());
	}

	@Test
	@DisplayName("Record 3963: Fax is 336-584-1149")
	void FaxOfRecord3963() {
		assertEquals("336-584-1149", customers.get(3962).getFax());
	}

	@Test
	@DisplayName("Record 3963: Email is kendall@tank.com")
	void EmailOfRecord3963() {
		assertEquals("kendall@tank.com", customers.get(3962).getEmail());
	}

	@Test
	@DisplayName("Record 3963: Web is http://www.kendalltank.com")
	void WebOfRecord3963() {
		assertEquals("http://www.kendalltank.com", customers.get(3962).getWeb());
	}
}
