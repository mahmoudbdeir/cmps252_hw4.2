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
class Record_1136 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1136: FirstName is Modesto")
	void FirstNameOfRecord1136() {
		assertEquals("Modesto", customers.get(1135).getFirstName());
	}

	@Test
	@DisplayName("Record 1136: LastName is Schuller")
	void LastNameOfRecord1136() {
		assertEquals("Schuller", customers.get(1135).getLastName());
	}

	@Test
	@DisplayName("Record 1136: Company is Imo Industries Inc")
	void CompanyOfRecord1136() {
		assertEquals("Imo Industries Inc", customers.get(1135).getCompany());
	}

	@Test
	@DisplayName("Record 1136: Address is Route 30w W")
	void AddressOfRecord1136() {
		assertEquals("Route 30w W", customers.get(1135).getAddress());
	}

	@Test
	@DisplayName("Record 1136: City is Greensburg")
	void CityOfRecord1136() {
		assertEquals("Greensburg", customers.get(1135).getCity());
	}

	@Test
	@DisplayName("Record 1136: County is Westmoreland")
	void CountyOfRecord1136() {
		assertEquals("Westmoreland", customers.get(1135).getCounty());
	}

	@Test
	@DisplayName("Record 1136: State is PA")
	void StateOfRecord1136() {
		assertEquals("PA", customers.get(1135).getState());
	}

	@Test
	@DisplayName("Record 1136: ZIP is 15601")
	void ZIPOfRecord1136() {
		assertEquals("15601", customers.get(1135).getZIP());
	}

	@Test
	@DisplayName("Record 1136: Phone is 724-834-7757")
	void PhoneOfRecord1136() {
		assertEquals("724-834-7757", customers.get(1135).getPhone());
	}

	@Test
	@DisplayName("Record 1136: Fax is 724-834-7757")
	void FaxOfRecord1136() {
		assertEquals("724-834-7757", customers.get(1135).getFax());
	}

	@Test
	@DisplayName("Record 1136: Email is modesto@schuller.com")
	void EmailOfRecord1136() {
		assertEquals("modesto@schuller.com", customers.get(1135).getEmail());
	}

	@Test
	@DisplayName("Record 1136: Web is http://www.modestoschuller.com")
	void WebOfRecord1136() {
		assertEquals("http://www.modestoschuller.com", customers.get(1135).getWeb());
	}
}
