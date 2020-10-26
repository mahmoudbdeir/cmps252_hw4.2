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

@Tag("40")
class Record_3730 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3730: FirstName is Buster")
	void FirstNameOfRecord3730() {
		assertEquals("Buster", customers.get(3729).getFirstName());
	}

	@Test
	@DisplayName("Record 3730: LastName is Reagan")
	void LastNameOfRecord3730() {
		assertEquals("Reagan", customers.get(3729).getLastName());
	}

	@Test
	@DisplayName("Record 3730: Company is Smith, Himmelmann Esq")
	void CompanyOfRecord3730() {
		assertEquals("Smith, Himmelmann Esq", customers.get(3729).getCompany());
	}

	@Test
	@DisplayName("Record 3730: Address is 811 Live Oak St")
	void AddressOfRecord3730() {
		assertEquals("811 Live Oak St", customers.get(3729).getAddress());
	}

	@Test
	@DisplayName("Record 3730: City is Tarpon Springs")
	void CityOfRecord3730() {
		assertEquals("Tarpon Springs", customers.get(3729).getCity());
	}

	@Test
	@DisplayName("Record 3730: County is Pinellas")
	void CountyOfRecord3730() {
		assertEquals("Pinellas", customers.get(3729).getCounty());
	}

	@Test
	@DisplayName("Record 3730: State is FL")
	void StateOfRecord3730() {
		assertEquals("FL", customers.get(3729).getState());
	}

	@Test
	@DisplayName("Record 3730: ZIP is 34689")
	void ZIPOfRecord3730() {
		assertEquals("34689", customers.get(3729).getZIP());
	}

	@Test
	@DisplayName("Record 3730: Phone is 727-938-1958")
	void PhoneOfRecord3730() {
		assertEquals("727-938-1958", customers.get(3729).getPhone());
	}

	@Test
	@DisplayName("Record 3730: Fax is 727-938-5436")
	void FaxOfRecord3730() {
		assertEquals("727-938-5436", customers.get(3729).getFax());
	}

	@Test
	@DisplayName("Record 3730: Email is buster@reagan.com")
	void EmailOfRecord3730() {
		assertEquals("buster@reagan.com", customers.get(3729).getEmail());
	}

	@Test
	@DisplayName("Record 3730: Web is http://www.busterreagan.com")
	void WebOfRecord3730() {
		assertEquals("http://www.busterreagan.com", customers.get(3729).getWeb());
	}
}
