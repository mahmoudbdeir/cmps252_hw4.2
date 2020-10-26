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

@Tag("42")
class Record_1935 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1935: FirstName is Marvin")
	void FirstNameOfRecord1935() {
		assertEquals("Marvin", customers.get(1934).getFirstName());
	}

	@Test
	@DisplayName("Record 1935: LastName is Deeks")
	void LastNameOfRecord1935() {
		assertEquals("Deeks", customers.get(1934).getLastName());
	}

	@Test
	@DisplayName("Record 1935: Company is Campbell, Joyce Ann Esq")
	void CompanyOfRecord1935() {
		assertEquals("Campbell, Joyce Ann Esq", customers.get(1934).getCompany());
	}

	@Test
	@DisplayName("Record 1935: Address is 10 E 33rd St")
	void AddressOfRecord1935() {
		assertEquals("10 E 33rd St", customers.get(1934).getAddress());
	}

	@Test
	@DisplayName("Record 1935: City is New York")
	void CityOfRecord1935() {
		assertEquals("New York", customers.get(1934).getCity());
	}

	@Test
	@DisplayName("Record 1935: County is New York")
	void CountyOfRecord1935() {
		assertEquals("New York", customers.get(1934).getCounty());
	}

	@Test
	@DisplayName("Record 1935: State is NY")
	void StateOfRecord1935() {
		assertEquals("NY", customers.get(1934).getState());
	}

	@Test
	@DisplayName("Record 1935: ZIP is 10016")
	void ZIPOfRecord1935() {
		assertEquals("10016", customers.get(1934).getZIP());
	}

	@Test
	@DisplayName("Record 1935: Phone is 212-481-7982")
	void PhoneOfRecord1935() {
		assertEquals("212-481-7982", customers.get(1934).getPhone());
	}

	@Test
	@DisplayName("Record 1935: Fax is 212-481-4165")
	void FaxOfRecord1935() {
		assertEquals("212-481-4165", customers.get(1934).getFax());
	}

	@Test
	@DisplayName("Record 1935: Email is marvin@deeks.com")
	void EmailOfRecord1935() {
		assertEquals("marvin@deeks.com", customers.get(1934).getEmail());
	}

	@Test
	@DisplayName("Record 1935: Web is http://www.marvindeeks.com")
	void WebOfRecord1935() {
		assertEquals("http://www.marvindeeks.com", customers.get(1934).getWeb());
	}
}
