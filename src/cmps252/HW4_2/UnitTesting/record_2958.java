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

@Tag("13")
class Record_2958 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2958: FirstName is Garth")
	void FirstNameOfRecord2958() {
		assertEquals("Garth", customers.get(2957).getFirstName());
	}

	@Test
	@DisplayName("Record 2958: LastName is Reece")
	void LastNameOfRecord2958() {
		assertEquals("Reece", customers.get(2957).getLastName());
	}

	@Test
	@DisplayName("Record 2958: Company is Law Offices Of Thomas P Aplin")
	void CompanyOfRecord2958() {
		assertEquals("Law Offices Of Thomas P Aplin", customers.get(2957).getCompany());
	}

	@Test
	@DisplayName("Record 2958: Address is 1415 Ne 80th St")
	void AddressOfRecord2958() {
		assertEquals("1415 Ne 80th St", customers.get(2957).getAddress());
	}

	@Test
	@DisplayName("Record 2958: City is Seattle")
	void CityOfRecord2958() {
		assertEquals("Seattle", customers.get(2957).getCity());
	}

	@Test
	@DisplayName("Record 2958: County is King")
	void CountyOfRecord2958() {
		assertEquals("King", customers.get(2957).getCounty());
	}

	@Test
	@DisplayName("Record 2958: State is WA")
	void StateOfRecord2958() {
		assertEquals("WA", customers.get(2957).getState());
	}

	@Test
	@DisplayName("Record 2958: ZIP is 98115")
	void ZIPOfRecord2958() {
		assertEquals("98115", customers.get(2957).getZIP());
	}

	@Test
	@DisplayName("Record 2958: Phone is 206-522-7412")
	void PhoneOfRecord2958() {
		assertEquals("206-522-7412", customers.get(2957).getPhone());
	}

	@Test
	@DisplayName("Record 2958: Fax is 206-522-4776")
	void FaxOfRecord2958() {
		assertEquals("206-522-4776", customers.get(2957).getFax());
	}

	@Test
	@DisplayName("Record 2958: Email is garth@reece.com")
	void EmailOfRecord2958() {
		assertEquals("garth@reece.com", customers.get(2957).getEmail());
	}

	@Test
	@DisplayName("Record 2958: Web is http://www.garthreece.com")
	void WebOfRecord2958() {
		assertEquals("http://www.garthreece.com", customers.get(2957).getWeb());
	}
}
