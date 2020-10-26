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

@Tag("26")
class Record_4021 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4021: FirstName is Alexandria")
	void FirstNameOfRecord4021() {
		assertEquals("Alexandria", customers.get(4020).getFirstName());
	}

	@Test
	@DisplayName("Record 4021: LastName is Bierwirth")
	void LastNameOfRecord4021() {
		assertEquals("Bierwirth", customers.get(4020).getLastName());
	}

	@Test
	@DisplayName("Record 4021: Company is Shakes, David L Esq")
	void CompanyOfRecord4021() {
		assertEquals("Shakes, David L Esq", customers.get(4020).getCompany());
	}

	@Test
	@DisplayName("Record 4021: Address is 218 Cedar St")
	void AddressOfRecord4021() {
		assertEquals("218 Cedar St", customers.get(4020).getAddress());
	}

	@Test
	@DisplayName("Record 4021: City is Abilene")
	void CityOfRecord4021() {
		assertEquals("Abilene", customers.get(4020).getCity());
	}

	@Test
	@DisplayName("Record 4021: County is Taylor")
	void CountyOfRecord4021() {
		assertEquals("Taylor", customers.get(4020).getCounty());
	}

	@Test
	@DisplayName("Record 4021: State is TX")
	void StateOfRecord4021() {
		assertEquals("TX", customers.get(4020).getState());
	}

	@Test
	@DisplayName("Record 4021: ZIP is 79601")
	void ZIPOfRecord4021() {
		assertEquals("79601", customers.get(4020).getZIP());
	}

	@Test
	@DisplayName("Record 4021: Phone is 325-675-4526")
	void PhoneOfRecord4021() {
		assertEquals("325-675-4526", customers.get(4020).getPhone());
	}

	@Test
	@DisplayName("Record 4021: Fax is 325-675-3357")
	void FaxOfRecord4021() {
		assertEquals("325-675-3357", customers.get(4020).getFax());
	}

	@Test
	@DisplayName("Record 4021: Email is alexandria@bierwirth.com")
	void EmailOfRecord4021() {
		assertEquals("alexandria@bierwirth.com", customers.get(4020).getEmail());
	}

	@Test
	@DisplayName("Record 4021: Web is http://www.alexandriabierwirth.com")
	void WebOfRecord4021() {
		assertEquals("http://www.alexandriabierwirth.com", customers.get(4020).getWeb());
	}
}
