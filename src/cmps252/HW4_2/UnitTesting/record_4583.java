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

@Tag("45")
class Record_4583 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4583: FirstName is Claire")
	void FirstNameOfRecord4583() {
		assertEquals("Claire", customers.get(4582).getFirstName());
	}

	@Test
	@DisplayName("Record 4583: LastName is Benavidez")
	void LastNameOfRecord4583() {
		assertEquals("Benavidez", customers.get(4582).getLastName());
	}

	@Test
	@DisplayName("Record 4583: Company is Meredith Cable")
	void CompanyOfRecord4583() {
		assertEquals("Meredith Cable", customers.get(4582).getCompany());
	}

	@Test
	@DisplayName("Record 4583: Address is 5829 Maspeth Ave")
	void AddressOfRecord4583() {
		assertEquals("5829 Maspeth Ave", customers.get(4582).getAddress());
	}

	@Test
	@DisplayName("Record 4583: City is Maspeth")
	void CityOfRecord4583() {
		assertEquals("Maspeth", customers.get(4582).getCity());
	}

	@Test
	@DisplayName("Record 4583: County is Queens")
	void CountyOfRecord4583() {
		assertEquals("Queens", customers.get(4582).getCounty());
	}

	@Test
	@DisplayName("Record 4583: State is NY")
	void StateOfRecord4583() {
		assertEquals("NY", customers.get(4582).getState());
	}

	@Test
	@DisplayName("Record 4583: ZIP is 11378")
	void ZIPOfRecord4583() {
		assertEquals("11378", customers.get(4582).getZIP());
	}

	@Test
	@DisplayName("Record 4583: Phone is 718-326-4187")
	void PhoneOfRecord4583() {
		assertEquals("718-326-4187", customers.get(4582).getPhone());
	}

	@Test
	@DisplayName("Record 4583: Fax is 718-326-1995")
	void FaxOfRecord4583() {
		assertEquals("718-326-1995", customers.get(4582).getFax());
	}

	@Test
	@DisplayName("Record 4583: Email is claire@benavidez.com")
	void EmailOfRecord4583() {
		assertEquals("claire@benavidez.com", customers.get(4582).getEmail());
	}

	@Test
	@DisplayName("Record 4583: Web is http://www.clairebenavidez.com")
	void WebOfRecord4583() {
		assertEquals("http://www.clairebenavidez.com", customers.get(4582).getWeb());
	}
}
