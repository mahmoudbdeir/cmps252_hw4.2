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

@Tag("16")
class Record_2671 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2671: FirstName is Myron")
	void FirstNameOfRecord2671() {
		assertEquals("Myron", customers.get(2670).getFirstName());
	}

	@Test
	@DisplayName("Record 2671: LastName is Bormuth")
	void LastNameOfRecord2671() {
		assertEquals("Bormuth", customers.get(2670).getLastName());
	}

	@Test
	@DisplayName("Record 2671: Company is Harvest Naturals")
	void CompanyOfRecord2671() {
		assertEquals("Harvest Naturals", customers.get(2670).getCompany());
	}

	@Test
	@DisplayName("Record 2671: Address is 1000 N Front St")
	void AddressOfRecord2671() {
		assertEquals("1000 N Front St", customers.get(2670).getAddress());
	}

	@Test
	@DisplayName("Record 2671: City is Lemoyne")
	void CityOfRecord2671() {
		assertEquals("Lemoyne", customers.get(2670).getCity());
	}

	@Test
	@DisplayName("Record 2671: County is Cumberland")
	void CountyOfRecord2671() {
		assertEquals("Cumberland", customers.get(2670).getCounty());
	}

	@Test
	@DisplayName("Record 2671: State is PA")
	void StateOfRecord2671() {
		assertEquals("PA", customers.get(2670).getState());
	}

	@Test
	@DisplayName("Record 2671: ZIP is 17043")
	void ZIPOfRecord2671() {
		assertEquals("17043", customers.get(2670).getZIP());
	}

	@Test
	@DisplayName("Record 2671: Phone is 717-763-1670")
	void PhoneOfRecord2671() {
		assertEquals("717-763-1670", customers.get(2670).getPhone());
	}

	@Test
	@DisplayName("Record 2671: Fax is 717-763-0915")
	void FaxOfRecord2671() {
		assertEquals("717-763-0915", customers.get(2670).getFax());
	}

	@Test
	@DisplayName("Record 2671: Email is myron@bormuth.com")
	void EmailOfRecord2671() {
		assertEquals("myron@bormuth.com", customers.get(2670).getEmail());
	}

	@Test
	@DisplayName("Record 2671: Web is http://www.myronbormuth.com")
	void WebOfRecord2671() {
		assertEquals("http://www.myronbormuth.com", customers.get(2670).getWeb());
	}
}
