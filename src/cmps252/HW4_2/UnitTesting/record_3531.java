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

@Tag("19")
class Record_3531 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3531: FirstName is Penny")
	void FirstNameOfRecord3531() {
		assertEquals("Penny", customers.get(3530).getFirstName());
	}

	@Test
	@DisplayName("Record 3531: LastName is Rowman")
	void LastNameOfRecord3531() {
		assertEquals("Rowman", customers.get(3530).getLastName());
	}

	@Test
	@DisplayName("Record 3531: Company is Kohne, Jeffery A")
	void CompanyOfRecord3531() {
		assertEquals("Kohne, Jeffery A", customers.get(3530).getCompany());
	}

	@Test
	@DisplayName("Record 3531: Address is 1221 4th St")
	void AddressOfRecord3531() {
		assertEquals("1221 4th St", customers.get(3530).getAddress());
	}

	@Test
	@DisplayName("Record 3531: City is Davis")
	void CityOfRecord3531() {
		assertEquals("Davis", customers.get(3530).getCity());
	}

	@Test
	@DisplayName("Record 3531: County is Yolo")
	void CountyOfRecord3531() {
		assertEquals("Yolo", customers.get(3530).getCounty());
	}

	@Test
	@DisplayName("Record 3531: State is CA")
	void StateOfRecord3531() {
		assertEquals("CA", customers.get(3530).getState());
	}

	@Test
	@DisplayName("Record 3531: ZIP is 95616")
	void ZIPOfRecord3531() {
		assertEquals("95616", customers.get(3530).getZIP());
	}

	@Test
	@DisplayName("Record 3531: Phone is 530-758-4934")
	void PhoneOfRecord3531() {
		assertEquals("530-758-4934", customers.get(3530).getPhone());
	}

	@Test
	@DisplayName("Record 3531: Fax is 530-758-1657")
	void FaxOfRecord3531() {
		assertEquals("530-758-1657", customers.get(3530).getFax());
	}

	@Test
	@DisplayName("Record 3531: Email is penny@rowman.com")
	void EmailOfRecord3531() {
		assertEquals("penny@rowman.com", customers.get(3530).getEmail());
	}

	@Test
	@DisplayName("Record 3531: Web is http://www.pennyrowman.com")
	void WebOfRecord3531() {
		assertEquals("http://www.pennyrowman.com", customers.get(3530).getWeb());
	}
}
