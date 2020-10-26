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
class Record_2747 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2747: FirstName is Roman")
	void FirstNameOfRecord2747() {
		assertEquals("Roman", customers.get(2746).getFirstName());
	}

	@Test
	@DisplayName("Record 2747: LastName is Schumacher")
	void LastNameOfRecord2747() {
		assertEquals("Schumacher", customers.get(2746).getLastName());
	}

	@Test
	@DisplayName("Record 2747: Company is Anahym Rubber & Ind Supl")
	void CompanyOfRecord2747() {
		assertEquals("Anahym Rubber & Ind Supl", customers.get(2746).getCompany());
	}

	@Test
	@DisplayName("Record 2747: Address is 245 Marcus Blvd")
	void AddressOfRecord2747() {
		assertEquals("245 Marcus Blvd", customers.get(2746).getAddress());
	}

	@Test
	@DisplayName("Record 2747: City is Hauppauge")
	void CityOfRecord2747() {
		assertEquals("Hauppauge", customers.get(2746).getCity());
	}

	@Test
	@DisplayName("Record 2747: County is Suffolk")
	void CountyOfRecord2747() {
		assertEquals("Suffolk", customers.get(2746).getCounty());
	}

	@Test
	@DisplayName("Record 2747: State is NY")
	void StateOfRecord2747() {
		assertEquals("NY", customers.get(2746).getState());
	}

	@Test
	@DisplayName("Record 2747: ZIP is 11788")
	void ZIPOfRecord2747() {
		assertEquals("11788", customers.get(2746).getZIP());
	}

	@Test
	@DisplayName("Record 2747: Phone is 631-434-3836")
	void PhoneOfRecord2747() {
		assertEquals("631-434-3836", customers.get(2746).getPhone());
	}

	@Test
	@DisplayName("Record 2747: Fax is 631-434-2808")
	void FaxOfRecord2747() {
		assertEquals("631-434-2808", customers.get(2746).getFax());
	}

	@Test
	@DisplayName("Record 2747: Email is roman@schumacher.com")
	void EmailOfRecord2747() {
		assertEquals("roman@schumacher.com", customers.get(2746).getEmail());
	}

	@Test
	@DisplayName("Record 2747: Web is http://www.romanschumacher.com")
	void WebOfRecord2747() {
		assertEquals("http://www.romanschumacher.com", customers.get(2746).getWeb());
	}
}
