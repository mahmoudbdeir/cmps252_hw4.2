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

@Tag("48")
class Record_2704 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2704: FirstName is Gale")
	void FirstNameOfRecord2704() {
		assertEquals("Gale", customers.get(2703).getFirstName());
	}

	@Test
	@DisplayName("Record 2704: LastName is Eriksson")
	void LastNameOfRecord2704() {
		assertEquals("Eriksson", customers.get(2703).getLastName());
	}

	@Test
	@DisplayName("Record 2704: Company is Western States Mechanical")
	void CompanyOfRecord2704() {
		assertEquals("Western States Mechanical", customers.get(2703).getCompany());
	}

	@Test
	@DisplayName("Record 2704: Address is 356 Union Ave")
	void AddressOfRecord2704() {
		assertEquals("356 Union Ave", customers.get(2703).getAddress());
	}

	@Test
	@DisplayName("Record 2704: City is Paterson")
	void CityOfRecord2704() {
		assertEquals("Paterson", customers.get(2703).getCity());
	}

	@Test
	@DisplayName("Record 2704: County is Passaic")
	void CountyOfRecord2704() {
		assertEquals("Passaic", customers.get(2703).getCounty());
	}

	@Test
	@DisplayName("Record 2704: State is NJ")
	void StateOfRecord2704() {
		assertEquals("NJ", customers.get(2703).getState());
	}

	@Test
	@DisplayName("Record 2704: ZIP is 7502")
	void ZIPOfRecord2704() {
		assertEquals("7502", customers.get(2703).getZIP());
	}

	@Test
	@DisplayName("Record 2704: Phone is 973-790-2341")
	void PhoneOfRecord2704() {
		assertEquals("973-790-2341", customers.get(2703).getPhone());
	}

	@Test
	@DisplayName("Record 2704: Fax is 973-790-4774")
	void FaxOfRecord2704() {
		assertEquals("973-790-4774", customers.get(2703).getFax());
	}

	@Test
	@DisplayName("Record 2704: Email is gale@eriksson.com")
	void EmailOfRecord2704() {
		assertEquals("gale@eriksson.com", customers.get(2703).getEmail());
	}

	@Test
	@DisplayName("Record 2704: Web is http://www.galeeriksson.com")
	void WebOfRecord2704() {
		assertEquals("http://www.galeeriksson.com", customers.get(2703).getWeb());
	}
}
