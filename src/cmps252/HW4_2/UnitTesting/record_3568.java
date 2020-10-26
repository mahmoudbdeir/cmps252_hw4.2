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
class Record_3568 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3568: FirstName is Max")
	void FirstNameOfRecord3568() {
		assertEquals("Max", customers.get(3567).getFirstName());
	}

	@Test
	@DisplayName("Record 3568: LastName is Flenard")
	void LastNameOfRecord3568() {
		assertEquals("Flenard", customers.get(3567).getLastName());
	}

	@Test
	@DisplayName("Record 3568: Company is Jette, Ernest A Esq")
	void CompanyOfRecord3568() {
		assertEquals("Jette, Ernest A Esq", customers.get(3567).getCompany());
	}

	@Test
	@DisplayName("Record 3568: Address is 3073 Ky Rt 321")
	void AddressOfRecord3568() {
		assertEquals("3073 Ky Rt 321", customers.get(3567).getAddress());
	}

	@Test
	@DisplayName("Record 3568: City is Prestonsburg")
	void CityOfRecord3568() {
		assertEquals("Prestonsburg", customers.get(3567).getCity());
	}

	@Test
	@DisplayName("Record 3568: County is Floyd")
	void CountyOfRecord3568() {
		assertEquals("Floyd", customers.get(3567).getCounty());
	}

	@Test
	@DisplayName("Record 3568: State is KY")
	void StateOfRecord3568() {
		assertEquals("KY", customers.get(3567).getState());
	}

	@Test
	@DisplayName("Record 3568: ZIP is 41653")
	void ZIPOfRecord3568() {
		assertEquals("41653", customers.get(3567).getZIP());
	}

	@Test
	@DisplayName("Record 3568: Phone is 606-886-8837")
	void PhoneOfRecord3568() {
		assertEquals("606-886-8837", customers.get(3567).getPhone());
	}

	@Test
	@DisplayName("Record 3568: Fax is 606-886-2831")
	void FaxOfRecord3568() {
		assertEquals("606-886-2831", customers.get(3567).getFax());
	}

	@Test
	@DisplayName("Record 3568: Email is max@flenard.com")
	void EmailOfRecord3568() {
		assertEquals("max@flenard.com", customers.get(3567).getEmail());
	}

	@Test
	@DisplayName("Record 3568: Web is http://www.maxflenard.com")
	void WebOfRecord3568() {
		assertEquals("http://www.maxflenard.com", customers.get(3567).getWeb());
	}
}
