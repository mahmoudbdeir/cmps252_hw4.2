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

@Tag("33")
class Record_3827 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3827: FirstName is Adalberto")
	void FirstNameOfRecord3827() {
		assertEquals("Adalberto", customers.get(3826).getFirstName());
	}

	@Test
	@DisplayName("Record 3827: LastName is Balkey")
	void LastNameOfRecord3827() {
		assertEquals("Balkey", customers.get(3826).getLastName());
	}

	@Test
	@DisplayName("Record 3827: Company is Quest Intrntl Flavors & Food")
	void CompanyOfRecord3827() {
		assertEquals("Quest Intrntl Flavors & Food", customers.get(3826).getCompany());
	}

	@Test
	@DisplayName("Record 3827: Address is 2 Elm St")
	void AddressOfRecord3827() {
		assertEquals("2 Elm St", customers.get(3826).getAddress());
	}

	@Test
	@DisplayName("Record 3827: City is Garfield")
	void CityOfRecord3827() {
		assertEquals("Garfield", customers.get(3826).getCity());
	}

	@Test
	@DisplayName("Record 3827: County is Bergen")
	void CountyOfRecord3827() {
		assertEquals("Bergen", customers.get(3826).getCounty());
	}

	@Test
	@DisplayName("Record 3827: State is NJ")
	void StateOfRecord3827() {
		assertEquals("NJ", customers.get(3826).getState());
	}

	@Test
	@DisplayName("Record 3827: ZIP is 7026")
	void ZIPOfRecord3827() {
		assertEquals("7026", customers.get(3826).getZIP());
	}

	@Test
	@DisplayName("Record 3827: Phone is 973-772-9021")
	void PhoneOfRecord3827() {
		assertEquals("973-772-9021", customers.get(3826).getPhone());
	}

	@Test
	@DisplayName("Record 3827: Fax is 973-772-9595")
	void FaxOfRecord3827() {
		assertEquals("973-772-9595", customers.get(3826).getFax());
	}

	@Test
	@DisplayName("Record 3827: Email is adalberto@balkey.com")
	void EmailOfRecord3827() {
		assertEquals("adalberto@balkey.com", customers.get(3826).getEmail());
	}

	@Test
	@DisplayName("Record 3827: Web is http://www.adalbertobalkey.com")
	void WebOfRecord3827() {
		assertEquals("http://www.adalbertobalkey.com", customers.get(3826).getWeb());
	}
}
