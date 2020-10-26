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

@Tag("9")
class Record_3485 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3485: FirstName is Ruben")
	void FirstNameOfRecord3485() {
		assertEquals("Ruben", customers.get(3484).getFirstName());
	}

	@Test
	@DisplayName("Record 3485: LastName is Mersinger")
	void LastNameOfRecord3485() {
		assertEquals("Mersinger", customers.get(3484).getLastName());
	}

	@Test
	@DisplayName("Record 3485: Company is J E Sawyer & Co Inc")
	void CompanyOfRecord3485() {
		assertEquals("J E Sawyer & Co Inc", customers.get(3484).getCompany());
	}

	@Test
	@DisplayName("Record 3485: Address is 801 S Main St")
	void AddressOfRecord3485() {
		assertEquals("801 S Main St", customers.get(3484).getAddress());
	}

	@Test
	@DisplayName("Record 3485: City is Findlay")
	void CityOfRecord3485() {
		assertEquals("Findlay", customers.get(3484).getCity());
	}

	@Test
	@DisplayName("Record 3485: County is Hancock")
	void CountyOfRecord3485() {
		assertEquals("Hancock", customers.get(3484).getCounty());
	}

	@Test
	@DisplayName("Record 3485: State is OH")
	void StateOfRecord3485() {
		assertEquals("OH", customers.get(3484).getState());
	}

	@Test
	@DisplayName("Record 3485: ZIP is 45840")
	void ZIPOfRecord3485() {
		assertEquals("45840", customers.get(3484).getZIP());
	}

	@Test
	@DisplayName("Record 3485: Phone is 419-422-7956")
	void PhoneOfRecord3485() {
		assertEquals("419-422-7956", customers.get(3484).getPhone());
	}

	@Test
	@DisplayName("Record 3485: Fax is 419-422-9754")
	void FaxOfRecord3485() {
		assertEquals("419-422-9754", customers.get(3484).getFax());
	}

	@Test
	@DisplayName("Record 3485: Email is ruben@mersinger.com")
	void EmailOfRecord3485() {
		assertEquals("ruben@mersinger.com", customers.get(3484).getEmail());
	}

	@Test
	@DisplayName("Record 3485: Web is http://www.rubenmersinger.com")
	void WebOfRecord3485() {
		assertEquals("http://www.rubenmersinger.com", customers.get(3484).getWeb());
	}
}
