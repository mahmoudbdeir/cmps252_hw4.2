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

@Tag("8")
class Record_3795 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3795: FirstName is Angelica")
	void FirstNameOfRecord3795() {
		assertEquals("Angelica", customers.get(3794).getFirstName());
	}

	@Test
	@DisplayName("Record 3795: LastName is Lacy")
	void LastNameOfRecord3795() {
		assertEquals("Lacy", customers.get(3794).getLastName());
	}

	@Test
	@DisplayName("Record 3795: Company is Applied Powder Technology Inc")
	void CompanyOfRecord3795() {
		assertEquals("Applied Powder Technology Inc", customers.get(3794).getCompany());
	}

	@Test
	@DisplayName("Record 3795: Address is 40 Mcwhorter Rd")
	void AddressOfRecord3795() {
		assertEquals("40 Mcwhorter Rd", customers.get(3794).getAddress());
	}

	@Test
	@DisplayName("Record 3795: City is Kearny")
	void CityOfRecord3795() {
		assertEquals("Kearny", customers.get(3794).getCity());
	}

	@Test
	@DisplayName("Record 3795: County is Hudson")
	void CountyOfRecord3795() {
		assertEquals("Hudson", customers.get(3794).getCounty());
	}

	@Test
	@DisplayName("Record 3795: State is NJ")
	void StateOfRecord3795() {
		assertEquals("NJ", customers.get(3794).getState());
	}

	@Test
	@DisplayName("Record 3795: ZIP is 7032")
	void ZIPOfRecord3795() {
		assertEquals("7032", customers.get(3794).getZIP());
	}

	@Test
	@DisplayName("Record 3795: Phone is 201-997-2417")
	void PhoneOfRecord3795() {
		assertEquals("201-997-2417", customers.get(3794).getPhone());
	}

	@Test
	@DisplayName("Record 3795: Fax is 201-997-3032")
	void FaxOfRecord3795() {
		assertEquals("201-997-3032", customers.get(3794).getFax());
	}

	@Test
	@DisplayName("Record 3795: Email is angelica@lacy.com")
	void EmailOfRecord3795() {
		assertEquals("angelica@lacy.com", customers.get(3794).getEmail());
	}

	@Test
	@DisplayName("Record 3795: Web is http://www.angelicalacy.com")
	void WebOfRecord3795() {
		assertEquals("http://www.angelicalacy.com", customers.get(3794).getWeb());
	}
}
