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

@Tag("20")
class Record_476 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 476: FirstName is Louisa")
	void FirstNameOfRecord476() {
		assertEquals("Louisa", customers.get(475).getFirstName());
	}

	@Test
	@DisplayName("Record 476: LastName is Lokhmator")
	void LastNameOfRecord476() {
		assertEquals("Lokhmator", customers.get(475).getLastName());
	}

	@Test
	@DisplayName("Record 476: Company is Allstate Business Archives")
	void CompanyOfRecord476() {
		assertEquals("Allstate Business Archives", customers.get(475).getCompany());
	}

	@Test
	@DisplayName("Record 476: Address is 9549 Penn Ave S")
	void AddressOfRecord476() {
		assertEquals("9549 Penn Ave S", customers.get(475).getAddress());
	}

	@Test
	@DisplayName("Record 476: City is Minneapolis")
	void CityOfRecord476() {
		assertEquals("Minneapolis", customers.get(475).getCity());
	}

	@Test
	@DisplayName("Record 476: County is Hennepin")
	void CountyOfRecord476() {
		assertEquals("Hennepin", customers.get(475).getCounty());
	}

	@Test
	@DisplayName("Record 476: State is MN")
	void StateOfRecord476() {
		assertEquals("MN", customers.get(475).getState());
	}

	@Test
	@DisplayName("Record 476: ZIP is 55431")
	void ZIPOfRecord476() {
		assertEquals("55431", customers.get(475).getZIP());
	}

	@Test
	@DisplayName("Record 476: Phone is 952-887-3996")
	void PhoneOfRecord476() {
		assertEquals("952-887-3996", customers.get(475).getPhone());
	}

	@Test
	@DisplayName("Record 476: Fax is 952-887-8771")
	void FaxOfRecord476() {
		assertEquals("952-887-8771", customers.get(475).getFax());
	}

	@Test
	@DisplayName("Record 476: Email is louisa@lokhmator.com")
	void EmailOfRecord476() {
		assertEquals("louisa@lokhmator.com", customers.get(475).getEmail());
	}

	@Test
	@DisplayName("Record 476: Web is http://www.louisalokhmator.com")
	void WebOfRecord476() {
		assertEquals("http://www.louisalokhmator.com", customers.get(475).getWeb());
	}
}
