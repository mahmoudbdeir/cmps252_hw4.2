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

@Tag("47")
class Record_4165 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4165: FirstName is Parker")
	void FirstNameOfRecord4165() {
		assertEquals("Parker", customers.get(4164).getFirstName());
	}

	@Test
	@DisplayName("Record 4165: LastName is Kandra")
	void LastNameOfRecord4165() {
		assertEquals("Kandra", customers.get(4164).getLastName());
	}

	@Test
	@DisplayName("Record 4165: Company is Metal Preparations")
	void CompanyOfRecord4165() {
		assertEquals("Metal Preparations", customers.get(4164).getCompany());
	}

	@Test
	@DisplayName("Record 4165: Address is Box #-1344")
	void AddressOfRecord4165() {
		assertEquals("Box #-1344", customers.get(4164).getAddress());
	}

	@Test
	@DisplayName("Record 4165: City is West Sacramento")
	void CityOfRecord4165() {
		assertEquals("West Sacramento", customers.get(4164).getCity());
	}

	@Test
	@DisplayName("Record 4165: County is Yolo")
	void CountyOfRecord4165() {
		assertEquals("Yolo", customers.get(4164).getCounty());
	}

	@Test
	@DisplayName("Record 4165: State is CA")
	void StateOfRecord4165() {
		assertEquals("CA", customers.get(4164).getState());
	}

	@Test
	@DisplayName("Record 4165: ZIP is 95691")
	void ZIPOfRecord4165() {
		assertEquals("95691", customers.get(4164).getZIP());
	}

	@Test
	@DisplayName("Record 4165: Phone is 916-372-7304")
	void PhoneOfRecord4165() {
		assertEquals("916-372-7304", customers.get(4164).getPhone());
	}

	@Test
	@DisplayName("Record 4165: Fax is 916-372-9101")
	void FaxOfRecord4165() {
		assertEquals("916-372-9101", customers.get(4164).getFax());
	}

	@Test
	@DisplayName("Record 4165: Email is parker@kandra.com")
	void EmailOfRecord4165() {
		assertEquals("parker@kandra.com", customers.get(4164).getEmail());
	}

	@Test
	@DisplayName("Record 4165: Web is http://www.parkerkandra.com")
	void WebOfRecord4165() {
		assertEquals("http://www.parkerkandra.com", customers.get(4164).getWeb());
	}
}
