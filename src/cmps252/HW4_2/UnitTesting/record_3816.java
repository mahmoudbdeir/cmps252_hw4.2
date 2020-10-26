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

@Tag("28")
class Record_3816 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3816: FirstName is Oralia")
	void FirstNameOfRecord3816() {
		assertEquals("Oralia", customers.get(3815).getFirstName());
	}

	@Test
	@DisplayName("Record 3816: LastName is Shaneyfelt")
	void LastNameOfRecord3816() {
		assertEquals("Shaneyfelt", customers.get(3815).getLastName());
	}

	@Test
	@DisplayName("Record 3816: Company is Rama World Screen Printing")
	void CompanyOfRecord3816() {
		assertEquals("Rama World Screen Printing", customers.get(3815).getCompany());
	}

	@Test
	@DisplayName("Record 3816: Address is 834 Morrow St")
	void AddressOfRecord3816() {
		assertEquals("834 Morrow St", customers.get(3815).getAddress());
	}

	@Test
	@DisplayName("Record 3816: City is Staten Island")
	void CityOfRecord3816() {
		assertEquals("Staten Island", customers.get(3815).getCity());
	}

	@Test
	@DisplayName("Record 3816: County is Richmond")
	void CountyOfRecord3816() {
		assertEquals("Richmond", customers.get(3815).getCounty());
	}

	@Test
	@DisplayName("Record 3816: State is NY")
	void StateOfRecord3816() {
		assertEquals("NY", customers.get(3815).getState());
	}

	@Test
	@DisplayName("Record 3816: ZIP is 10303")
	void ZIPOfRecord3816() {
		assertEquals("10303", customers.get(3815).getZIP());
	}

	@Test
	@DisplayName("Record 3816: Phone is 718-816-5276")
	void PhoneOfRecord3816() {
		assertEquals("718-816-5276", customers.get(3815).getPhone());
	}

	@Test
	@DisplayName("Record 3816: Fax is 718-816-8596")
	void FaxOfRecord3816() {
		assertEquals("718-816-8596", customers.get(3815).getFax());
	}

	@Test
	@DisplayName("Record 3816: Email is oralia@shaneyfelt.com")
	void EmailOfRecord3816() {
		assertEquals("oralia@shaneyfelt.com", customers.get(3815).getEmail());
	}

	@Test
	@DisplayName("Record 3816: Web is http://www.oraliashaneyfelt.com")
	void WebOfRecord3816() {
		assertEquals("http://www.oraliashaneyfelt.com", customers.get(3815).getWeb());
	}
}
