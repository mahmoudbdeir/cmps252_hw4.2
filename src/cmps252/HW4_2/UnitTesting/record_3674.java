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

@Tag("3")
class Record_3674 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3674: FirstName is Victoria")
	void FirstNameOfRecord3674() {
		assertEquals("Victoria", customers.get(3673).getFirstName());
	}

	@Test
	@DisplayName("Record 3674: LastName is Lige")
	void LastNameOfRecord3674() {
		assertEquals("Lige", customers.get(3673).getLastName());
	}

	@Test
	@DisplayName("Record 3674: Company is J Watson Co Inc")
	void CompanyOfRecord3674() {
		assertEquals("J Watson Co Inc", customers.get(3673).getCompany());
	}

	@Test
	@DisplayName("Record 3674: Address is 35 W 18th St")
	void AddressOfRecord3674() {
		assertEquals("35 W 18th St", customers.get(3673).getAddress());
	}

	@Test
	@DisplayName("Record 3674: City is Union City")
	void CityOfRecord3674() {
		assertEquals("Union City", customers.get(3673).getCity());
	}

	@Test
	@DisplayName("Record 3674: County is Hudson")
	void CountyOfRecord3674() {
		assertEquals("Hudson", customers.get(3673).getCounty());
	}

	@Test
	@DisplayName("Record 3674: State is NJ")
	void StateOfRecord3674() {
		assertEquals("NJ", customers.get(3673).getState());
	}

	@Test
	@DisplayName("Record 3674: ZIP is 7087")
	void ZIPOfRecord3674() {
		assertEquals("7087", customers.get(3673).getZIP());
	}

	@Test
	@DisplayName("Record 3674: Phone is 201-330-4329")
	void PhoneOfRecord3674() {
		assertEquals("201-330-4329", customers.get(3673).getPhone());
	}

	@Test
	@DisplayName("Record 3674: Fax is 201-330-7499")
	void FaxOfRecord3674() {
		assertEquals("201-330-7499", customers.get(3673).getFax());
	}

	@Test
	@DisplayName("Record 3674: Email is victoria@lige.com")
	void EmailOfRecord3674() {
		assertEquals("victoria@lige.com", customers.get(3673).getEmail());
	}

	@Test
	@DisplayName("Record 3674: Web is http://www.victorialige.com")
	void WebOfRecord3674() {
		assertEquals("http://www.victorialige.com", customers.get(3673).getWeb());
	}
}
