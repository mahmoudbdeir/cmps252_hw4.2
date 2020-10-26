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

@Tag("43")
class Record_4559 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4559: FirstName is Abe")
	void FirstNameOfRecord4559() {
		assertEquals("Abe", customers.get(4558).getFirstName());
	}

	@Test
	@DisplayName("Record 4559: LastName is Elawar")
	void LastNameOfRecord4559() {
		assertEquals("Elawar", customers.get(4558).getLastName());
	}

	@Test
	@DisplayName("Record 4559: Company is Amercn Scty For Photogrammetry")
	void CompanyOfRecord4559() {
		assertEquals("Amercn Scty For Photogrammetry", customers.get(4558).getCompany());
	}

	@Test
	@DisplayName("Record 4559: Address is 5333 Mcauley Dr")
	void AddressOfRecord4559() {
		assertEquals("5333 Mcauley Dr", customers.get(4558).getAddress());
	}

	@Test
	@DisplayName("Record 4559: City is Ypsilanti")
	void CityOfRecord4559() {
		assertEquals("Ypsilanti", customers.get(4558).getCity());
	}

	@Test
	@DisplayName("Record 4559: County is Washtenaw")
	void CountyOfRecord4559() {
		assertEquals("Washtenaw", customers.get(4558).getCounty());
	}

	@Test
	@DisplayName("Record 4559: State is MI")
	void StateOfRecord4559() {
		assertEquals("MI", customers.get(4558).getState());
	}

	@Test
	@DisplayName("Record 4559: ZIP is 48197")
	void ZIPOfRecord4559() {
		assertEquals("48197", customers.get(4558).getZIP());
	}

	@Test
	@DisplayName("Record 4559: Phone is 734-572-9274")
	void PhoneOfRecord4559() {
		assertEquals("734-572-9274", customers.get(4558).getPhone());
	}

	@Test
	@DisplayName("Record 4559: Fax is 734-572-7777")
	void FaxOfRecord4559() {
		assertEquals("734-572-7777", customers.get(4558).getFax());
	}

	@Test
	@DisplayName("Record 4559: Email is abe@elawar.com")
	void EmailOfRecord4559() {
		assertEquals("abe@elawar.com", customers.get(4558).getEmail());
	}

	@Test
	@DisplayName("Record 4559: Web is http://www.abeelawar.com")
	void WebOfRecord4559() {
		assertEquals("http://www.abeelawar.com", customers.get(4558).getWeb());
	}
}
